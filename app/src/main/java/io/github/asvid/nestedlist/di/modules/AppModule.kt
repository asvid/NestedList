package io.github.asvid.nestedlist.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import io.github.asvid.nestedlist.App
import io.github.asvid.nestedlist.di.components.MainActivityComponent
import io.github.asvid.nestedlist.di.components.PhotosFragmentComponent

/**
 * Provides objects related to Android framework
 * */
@Module(
  subcomponents = [
    MainActivityComponent::class,
    PhotosFragmentComponent::class
  ]
)
class AppModule {

  @Provides
  internal fun context(application: App): Context {
    return application.applicationContext
  }
}