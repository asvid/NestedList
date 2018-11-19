package io.github.asvid.nestedlist.ui.photoslist

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xwray.groupie.ExpandableGroup
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import io.github.asvid.nestedlist.R
import io.github.asvid.nestedlist.ui.BaseFragment
import io.github.asvid.nestedlist.utils.GlideApp
import io.github.asvid.nestedlist.utils.MarginItemDecoration
import kotlinx.android.synthetic.main.fragment_photos.*
import kotlinx.android.synthetic.main.fragment_photos.view.*
import javax.inject.Inject

/**
 * Fragment containing [Photo]s list, it extends [BaseFragment] and [PhotosView]
 *
 * @property presenter - injected by Dagger [Presenter] object
 * @property groupAdapter - adapter for [Photo]s list
 * */
class PhotosFragment : BaseFragment(), PhotosView {

  @Inject
  lateinit var presenter: Presenter

  private val groupAdapter = GroupAdapter<ViewHolder>()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): android.view.View? {
    val view = inflater.inflate(R.layout.fragment_photos, container, false)

    view.photos_list_recyclerView.apply {
      layoutManager = LinearLayoutManager(context)
      adapter = groupAdapter
      addItemDecoration(MarginItemDecoration(resources.getDimension(R.dimen.default_padding).toInt()))
      setHasFixedSize(true)
      setItemViewCacheSize(300)
    }
    return view
  }

  override fun showProgressBar() {
    photos_progressbar.visibility = View.VISIBLE
  }

  override fun showGettingPhotosError() {
    Snackbar
      .make(this.view!!, R.string.error_downloading_photos, Snackbar.LENGTH_INDEFINITE)
      .setAction(R.string.retry) { presenter.retryGetPhotos() }
      .show()
  }

  override fun hideProgressBar() {
    photos_progressbar.visibility = View.GONE
  }

  override fun addToAdapter(group: ExpandableGroup) {
    groupAdapter.add(group)
  }


  override fun onResume() {
    super.onResume()
    presenter.setGlide(GlideApp.with(this))
    presenter.bindView(this, compositeDisposable)
  }
}