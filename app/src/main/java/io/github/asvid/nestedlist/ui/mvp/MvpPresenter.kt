package io.github.asvid.nestedlist.ui.mvp

import io.reactivex.disposables.CompositeDisposable

/**
 * Interface to extend by concrete MVP presenter. It's binded with view extending [MvpView]
 * */
interface MvpPresenter<V : MvpView> {

  /**
   * binds [MvpView] with [MvpPresenter], also provides [CompositeDisposable] for presenter so it doesn't need to contain Fragment lifecycle
   *
   * @param view - view to be binded with presenter instance
   * @param compositeDisposable - disposable bag to be cleared when view is destroyed, it's not created in [MvpPresenter] so it doesn't have to provide and handle lifecycle
   * */
  fun bindView(view: V, compositeDisposable: CompositeDisposable)
}