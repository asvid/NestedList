package io.github.asvid.nestedlist.appservices.photos

import io.github.asvid.nestedlist.domain.Photo
import io.reactivex.Flowable

interface PhotosService {
    fun getPhotos(): Flowable<Photo>
}