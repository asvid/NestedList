package io.github.asvid.nestedlist.di

import android.support.v4.app.Fragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.support.FragmentKey
import dagger.multibindings.IntoMap
import io.github.asvid.nestedlist.di.components.PhotosFragmentComponent
import io.github.asvid.nestedlist.ui.photoslist.PhotosFragment

@Module
abstract class
FragmentBinder {

  @Binds
  @IntoMap
  @FragmentKey(PhotosFragment::class)
  abstract fun bindPhotosFragmentInjectorFactory(
    builder: PhotosFragmentComponent.Builder
  ): AndroidInjector.Factory<out Fragment>
}