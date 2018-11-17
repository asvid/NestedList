package io.github.asvid.nestedlist.ui.mvp

interface MvpPresenter<V : MvpView> {

  fun bindView(view: V)
}