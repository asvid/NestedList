package io.github.asvid.nestedlist.ui.photoslist

import com.xwray.groupie.ExpandableGroup
import io.github.asvid.nestedlist.ui.mvp.MvpPresenter
import io.github.asvid.nestedlist.ui.mvp.MvpView
import io.github.asvid.nestedlist.utils.GlideRequests

interface PhotosView : MvpView {
  fun showProgressBar()
  fun showGettingPhotosError()
  fun hideProgressBar()
  fun addToAdapter(expandableGroup: ExpandableGroup)
}

interface Presenter : MvpPresenter<PhotosView> {
  fun setGlide(glideRequests: GlideRequests)
  fun retryGetPhotos()
}