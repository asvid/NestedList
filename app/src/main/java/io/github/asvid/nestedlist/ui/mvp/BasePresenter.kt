package io.github.asvid.nestedlist.ui.mvp

import io.reactivex.disposables.CompositeDisposable
import timber.log.Timber

abstract class BasePresenter<V : MvpView> : MvpPresenter<V> {

  protected lateinit var view: V
  protected lateinit var compositeDisposable: CompositeDisposable

  override fun bindView(view: V, compositeDisposable: CompositeDisposable) {
    Timber.d("binding presenter $this")
    this.view = view
    this.compositeDisposable = compositeDisposable
  }
}