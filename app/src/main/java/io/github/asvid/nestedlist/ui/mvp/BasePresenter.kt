package io.github.asvid.nestedlist.ui.mvp

import io.reactivex.disposables.CompositeDisposable
import timber.log.Timber

/**
 * Base class that handles [MvpView] and [CompositeDisposable] binding so it doesn't have to be done in each [MvpPresenter]
 * */
abstract class BasePresenter<V : MvpView> : MvpPresenter<V> {

  protected lateinit var view: V
  protected lateinit var compositeDisposable: CompositeDisposable

  override fun bindView(view: V, compositeDisposable: CompositeDisposable) {
    Timber.d("binding presenter $this")
    this.view = view
    this.compositeDisposable = compositeDisposable
  }
}