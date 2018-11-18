package io.github.asvid.nestedlist.ui.mvp

import io.reactivex.disposables.CompositeDisposable

interface MvpPresenter<V : MvpView> {

  fun bindView(view: V, compositeDisposable: CompositeDisposable)
}