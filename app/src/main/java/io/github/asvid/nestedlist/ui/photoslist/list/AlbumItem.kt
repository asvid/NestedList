package io.github.asvid.nestedlist.ui.photoslist.list

import com.xwray.groupie.ExpandableGroup
import com.xwray.groupie.ExpandableItem
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import io.github.asvid.nestedlist.R
import kotlinx.android.synthetic.main.item_album.*

class AlbumItem(
  private val name: String,
  private val id: Int
) : Item(), ExpandableItem {

  private lateinit var photosExpandableGroup: ExpandableGroup

  override fun setExpandableGroup(onToggleListener: ExpandableGroup) {
    photosExpandableGroup = onToggleListener
  }

  override fun bind(viewHolder: ViewHolder, position: Int) {
    viewHolder.album_name.text = name

    viewHolder.item_album_container.setOnClickListener {
      photosExpandableGroup.onToggleExpanded()
    }
  }


  override fun getLayout() = R.layout.item_album
}