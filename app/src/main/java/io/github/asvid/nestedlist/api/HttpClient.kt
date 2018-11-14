package io.github.asvid.nestedlist.api

import io.github.asvid.nestedlist.api.interceptors.CacheInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import timber.log.Timber

private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

class HttpClient {

    private fun buildHttpClient(): OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(CacheInterceptor())
        .addInterceptor(
            HttpLoggingInterceptor(
                HttpLoggingInterceptor.Logger { message -> Timber.tag("OkHttp").d(message) })
                .setLevel(HttpLoggingInterceptor.Level.BASIC)
        )
        .build()

    fun buildRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(buildHttpClient())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

}