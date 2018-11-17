package io.github.asvid.nestedlist.ui

import android.content.Context
import android.support.v4.app.Fragment
import dagger.android.support.AndroidSupportInjection
import io.reactivex.disposables.CompositeDisposable

abstract class BaseFragment : Fragment() {

  protected val compositeDisposable = CompositeDisposable()

  override fun onAttach(context: Context) {
    AndroidSupportInjection.inject(this)
    super.onAttach(context)
  }

  override fun onPause() {
    super.onPause()
    compositeDisposable.dispose()
  }
}