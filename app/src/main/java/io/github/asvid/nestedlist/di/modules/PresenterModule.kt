package io.github.asvid.nestedlist.di.modules

import dagger.Module
import dagger.Provides
import io.github.asvid.nestedlist.appservices.photos.PhotosService
import io.github.asvid.nestedlist.ui.photoslist.PhotosPresenter
import io.github.asvid.nestedlist.ui.photoslist.Presenter

@Module(includes = [AppServiceModule::class])
class PresenterModule {

  @Provides
  fun photosPresenter(photosService: PhotosService): Presenter = PhotosPresenter(photosService)

}