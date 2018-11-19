package io.github.asvid.nestedlist.ui

import android.content.Context
import android.support.v4.app.Fragment
import dagger.android.support.AndroidSupportInjection
import io.reactivex.disposables.CompositeDisposable

/**
 * Base Fragment class that handles initialization and cleaning of [CompositeDisposable] and Dagger injection
 *
 * @property compositeDisposable - disposable bag cleaned when fragment is paused
 * */
abstract class BaseFragment : Fragment() {

  protected val compositeDisposable = CompositeDisposable()

  /**
   * Dagger injection
   * */
  override fun onAttach(context: Context) {
    AndroidSupportInjection.inject(this)
    super.onAttach(context)
  }

  /**
   * cleaning [compositeDisposable]
   * */
  override fun onPause() {
    super.onPause()
    compositeDisposable.dispose()
  }
}