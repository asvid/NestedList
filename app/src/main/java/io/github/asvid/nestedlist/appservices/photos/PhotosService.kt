package io.github.asvid.nestedlist.appservices.photos

import io.github.asvid.nestedlist.domain.Photo
import io.reactivex.Flowable

/**
 * App service for obtaining and manipulating [Photo]s
 * For the moment used only for getting [Photo]s
 * */
interface PhotosService {

  /**
   * gets [Photo]s from API
   *
   * @return [Flowable] of [Photo]s
   * */
  fun getPhotos(): Flowable<Photo>
}