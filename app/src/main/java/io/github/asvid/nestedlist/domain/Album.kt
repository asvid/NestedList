package io.github.asvid.nestedlist.domain

/**
 *
 * Domain class for album in [PhotosResponse]
 *
 * @property name - album name created from [id]
 * @property id - ID of album
 * @property photos - mutable list of [Photo]s
 * */
data class Album(
  val name: String,
  val id: Int,
  val photos: MutableList<Photo> = mutableListOf()
)