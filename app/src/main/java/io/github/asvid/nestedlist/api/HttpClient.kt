package io.github.asvid.nestedlist.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import timber.log.Timber

/**
 * Provides HTTP client for jsonplaceholder.typicode.com
 * */
private const val JSON_PLACEHOLDER_BASE_URL = "https://jsonplaceholder.typicode.com/"

class HttpClient {

  private fun buildHttpClient(): OkHttpClient = OkHttpClient.Builder()
    .addInterceptor(
      HttpLoggingInterceptor(
        HttpLoggingInterceptor.Logger { message -> Timber.tag("OkHttp").d(message) })
        .setLevel(HttpLoggingInterceptor.Level.BASIC)
    )
    .build()

  /**
   * Builds [Retrofit] instance for jsonplaceholder API with [OkHttpClient]
   * JSON conversion is made with [Moshi]
   *
   * @return [Retrofit] configured for jsonplaceholder API
   * */
  fun buildJsonPlaceholderClient(): Retrofit = Retrofit.Builder()
    .baseUrl(JSON_PLACEHOLDER_BASE_URL)
    .client(buildHttpClient())
    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    .addConverterFactory(MoshiConverterFactory.create())
    .build()

}