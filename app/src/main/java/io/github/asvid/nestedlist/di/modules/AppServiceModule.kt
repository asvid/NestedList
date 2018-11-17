package io.github.asvid.nestedlist.di.modules

import dagger.Module
import dagger.Provides
import io.github.asvid.nestedlist.api.JsonPlaceholderService
import io.github.asvid.nestedlist.appservices.photos.PhotosService
import io.github.asvid.nestedlist.appservices.photos.PhotosServiceImpl
import javax.inject.Singleton

@Module(
  includes = [
    ApiModule::class
  ]
)
class AppServiceModule {

  @Singleton
  @Provides
  fun providePhotosService(photosApi: JsonPlaceholderService): PhotosService =
    PhotosServiceImpl(photosApi)

}