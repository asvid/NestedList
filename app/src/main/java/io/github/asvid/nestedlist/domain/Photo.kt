package io.github.asvid.nestedlist.domain

/**
 * Domain class for [PhotosResponse]
 *
 * @property thumbnailUrl - url of thumbnail 150x150px
 * @property photoUrl - url of photo in full size
 * @property albumId - ID of album, albums are separate domain objects
 * @property photoId - ID of photo
 * @property title - title of photo
 * */
data class Photo(
  val thumbnailUrl: String,
  val photoUrl: String,
  val albumId: Int,
  val photoId: Int,
  val title: String
)