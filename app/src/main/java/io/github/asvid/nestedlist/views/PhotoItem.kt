package io.github.asvid.nestedlist.views

import android.util.DisplayMetrics
import android.util.TypedValue
import com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import io.github.asvid.nestedlist.R
import io.github.asvid.nestedlist.utils.GlideRequests
import kotlinx.android.synthetic.main.item_photo.*


class PhotoItem(
  private val name: String,
  private val thumbnailUrl: String = "",
  private val glide: GlideRequests
) : Item() {

  override fun bind(viewHolder: ViewHolder, position: Int) {
    viewHolder.photo_title.text = name

    val dp =
      TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 64.0F, DisplayMetrics()).toInt()

    glide.load(thumbnailUrl)
      .diskCacheStrategy(DiskCacheStrategy.ALL)
      .format(PREFER_ARGB_8888)
      .override(dp, dp)
      .centerCrop()
      .placeholder(R.mipmap.ic_launcher)
      .into(viewHolder.photo_image)

  }


  override fun getLayout() = R.layout.item_photo
}