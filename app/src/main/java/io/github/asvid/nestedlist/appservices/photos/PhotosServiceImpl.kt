package io.github.asvid.nestedlist.appservices.photos

import io.github.asvid.nestedlist.api.JsonPlaceholderService
import io.github.asvid.nestedlist.domain.Photo
import io.reactivex.Flowable

class PhotosServiceImpl(private val photosApi: JsonPlaceholderService) : PhotosService {

  override fun getPhotos(): Flowable<Photo> = photosApi
    .getPhotos()
    .flattenAsFlowable { e -> e }
    .map { Photo(it.thumbnailUrl, it.url, it.albumId, it.id, it.title) }
}