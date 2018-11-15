package io.github.asvid.nestedlist.views

import com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import io.github.asvid.nestedlist.R
import io.github.asvid.nestedlist.utils.GlideRequests
import kotlinx.android.synthetic.main.item_photo.*

class PhotoItem(
  private val name: String,
  private val id: Int = 0,
  private val thumbnailUrl: String = "",
  private val photoUrl: String = "",
  private val glide: GlideRequests
) : Item() {

  override fun bind(viewHolder: ViewHolder, position: Int) {
    viewHolder.photo_title.text = name

    glide.load(thumbnailUrl)
      .format(PREFER_ARGB_8888)
      .thumbnail(0.25f)
      .placeholder(R.mipmap.ic_launcher)
      .diskCacheStrategy(DiskCacheStrategy.ALL)
      .centerCrop()
      .into(viewHolder.photo_image)
  }

  override fun getLayout() = R.layout.item_photo
}