package io.github.asvid.nestedlist.domain

data class Album(
    val name: String,
    val id: Int,
    val photos: MutableList<Photo> = mutableListOf()
)