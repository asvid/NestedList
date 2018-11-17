package io.github.asvid.nestedlist.ui.photoslist

import com.xwray.groupie.ExpandableGroup
import io.github.asvid.nestedlist.ui.mvp.MvpPresenter
import io.github.asvid.nestedlist.ui.mvp.MvpView
import io.github.asvid.nestedlist.utils.GlideRequests

interface View : MvpView {
  fun showProgressBar()
  fun showGettingPhotosError()
  fun hideProgressBar()
  fun addToAdapter(expandableGroup: ExpandableGroup)
}

interface Presenter : MvpPresenter<View> {
  fun setGlide(glideRequests: GlideRequests)
}