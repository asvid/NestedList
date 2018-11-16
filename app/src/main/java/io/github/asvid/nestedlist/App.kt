package io.github.asvid.nestedlist

import android.app.Activity
import android.app.Application
import com.codemonkeylabs.fpslibrary.TinyDancer
import com.squareup.leakcanary.LeakCanary
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import io.github.asvid.nestedlist.di.components.DaggerAppComponent
import timber.log.Timber
import javax.inject.Inject

class App : Application(), HasActivityInjector {

  @Inject
  lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

  override fun activityInjector(): AndroidInjector<Activity> {
    return dispatchingAndroidInjector
  }

  /**
   *  Dagger 2 initialisation
   * */
  init {
    DaggerAppComponent
      .builder()
      .application(this)
      .build()
      .inject(this)
  }

  override fun onCreate() {
    super.onCreate()

    initLeakCanary()
    initTimber()
    initTinyDancer()
  }

  private fun initTinyDancer() {
    TinyDancer.create()
      .show(this)

    //alternatively
    TinyDancer.create()
      .redFlagPercentage(.1f) // set red indicator for 10%....different from default
      .startingXPosition(200)
      .startingYPosition(600)
      .show(this)
  }


  private fun initTimber() {
    Timber.plant(Timber.DebugTree())
  }

  private fun initLeakCanary() {
    if (LeakCanary.isInAnalyzerProcess(this)) {
      return
    }
    LeakCanary.install(this)
  }
}