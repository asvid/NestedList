package io.github.asvid.nestedlist.api

import io.github.asvid.nestedlist.api.response.PhotosResponse
import io.reactivex.Single
import retrofit2.http.GET

interface JsonPlaceholderService {

  //  https://jsonplaceholder.typicode.com/photos
  @GET("photos")
  fun getPhotos(): Single<List<PhotosResponse>>
}