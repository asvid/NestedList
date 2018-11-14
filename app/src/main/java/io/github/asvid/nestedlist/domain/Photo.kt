package io.github.asvid.nestedlist.domain

data class Photo(
    val thumbnailUrl: String,
    val photoUrl: String,
    val albumId: Int,
    val photoId: Int,
    val title: String
)