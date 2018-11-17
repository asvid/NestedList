package io.github.asvid.nestedlist.ui.photoslist

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.ViewGroup
import com.xwray.groupie.ExpandableGroup
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import io.github.asvid.nestedlist.R
import io.github.asvid.nestedlist.appservices.photos.PhotosService
import io.github.asvid.nestedlist.ui.BaseFragment
import io.github.asvid.nestedlist.utils.GlideApp
import io.github.asvid.nestedlist.utils.MarginItemDecoration
import kotlinx.android.synthetic.main.fragment_photos.view.*
import javax.inject.Inject

class PhotosFragment : BaseFragment(), View {
  override fun showProgressBar() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun showGettingPhotosError() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun hideProgressBar() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun addToAdapter(expandableGroup: ExpandableGroup) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  @Inject
  lateinit var presenter: Presenter

  @Inject
  lateinit var photosService: PhotosService

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): android.view.View? {
    presenter.setGlide(GlideApp.with(this))
    presenter.bindView(this)
    val view = inflater.inflate(R.layout.fragment_photos, container, false)
    val groupAdapter = GroupAdapter<ViewHolder>()


    view.photos_list_recyclerView.apply {
      layoutManager = LinearLayoutManager(context)
      adapter = groupAdapter
      addItemDecoration(MarginItemDecoration(resources.getDimension(R.dimen.default_padding).toInt()))
      setHasFixedSize(true)
      setItemViewCacheSize(300)
    }

    return view
  }
}