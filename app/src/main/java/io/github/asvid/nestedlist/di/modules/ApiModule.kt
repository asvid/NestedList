package io.github.asvid.nestedlist.di.modules

import dagger.Module
import dagger.Provides
import io.github.asvid.nestedlist.api.HttpClient
import io.github.asvid.nestedlist.api.JsonPlaceholderService
import javax.inject.Singleton

/**
 * Provides objects related to API, Http requests etc.
 * */
@Module(
  includes = [
    AppModule::class
  ]
)
class ApiModule {

  @Singleton
  @Provides
  fun provideJsonPlaveholderApi(): JsonPlaceholderService =
    HttpClient().buildJsonPlaceholderClient().create(JsonPlaceholderService::class.java)

}