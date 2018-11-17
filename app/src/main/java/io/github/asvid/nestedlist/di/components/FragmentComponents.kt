package io.github.asvid.nestedlist.di.components

import dagger.Module
import dagger.Subcomponent
import dagger.android.AndroidInjector
import io.github.asvid.nestedlist.ui.photoslist.PhotosFragment

@Subcomponent(modules = [PhotosFragmentComponent.PhotosFragmentModule::class])
interface PhotosFragmentComponent : AndroidInjector<PhotosFragment> {

  @Subcomponent.Builder
  abstract class Builder : AndroidInjector.Builder<PhotosFragment>()

  @Module
  abstract class PhotosFragmentModule

}