package io.github.asvid.nestedlist.api.response

import com.squareup.moshi.Json

/**
 * Used to parse JSON answer from API
 * */
data class PhotosResponse(
  @Json(name = "albumId")
  val albumId: Int = 0,
  @Json(name = "id")
  val id: Int = 0,
  @Json(name = "title")
  val title: String = "",
  @Json(name = "url")
  val url: String = "",
  @Json(name = "thumbnailUrl")
  val thumbnailUrl: String = ""
)