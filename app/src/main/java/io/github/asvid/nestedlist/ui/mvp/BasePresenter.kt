package io.github.asvid.nestedlist.ui.mvp

import timber.log.Timber

abstract class BasePresenter<V : MvpView> : MvpPresenter<V> {

  var view: V? = null

  override fun bindView(view: V) {
    Timber.d("binding presenter $this")
    this.view = view
  }
}