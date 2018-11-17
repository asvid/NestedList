package io.github.asvid.nestedlist

import android.app.Activity
import android.app.Application
import com.squareup.leakcanary.LeakCanary
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import io.github.asvid.nestedlist.di.components.DaggerAppComponent
import timber.log.Timber
import javax.inject.Inject

class App : Application(), HasActivityInjector, HasSupportFragmentInjector {

  @Inject
  lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>
  @Inject
  lateinit var dispatchingFragmentInjector: DispatchingAndroidInjector<android.support.v4.app.Fragment>

  override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

  override fun supportFragmentInjector(): AndroidInjector<android.support.v4.app.Fragment> =
    dispatchingFragmentInjector

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