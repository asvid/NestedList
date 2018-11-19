package io.github.asvid.nestedlist.ui.photoslist

import com.xwray.groupie.ExpandableGroup
import com.xwray.groupie.Section
import io.github.asvid.nestedlist.appservices.photos.PhotosService
import io.github.asvid.nestedlist.domain.Album
import io.github.asvid.nestedlist.ui.mvp.BasePresenter
import io.github.asvid.nestedlist.ui.photoslist.list.AlbumItem
import io.github.asvid.nestedlist.ui.photoslist.list.PhotoItem
import io.github.asvid.nestedlist.utils.GlideRequests
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

/**
 * Concrete presenter for [Photo] list view
 * It extends [Presenter] from [PhotosListContract] and [BasePresenter] that handles view binding
 *
 * @param photosService - app service for obtaining [Photo]s
 * */
class PhotosPresenter(private val photosService: PhotosService) : BasePresenter<PhotosView>(),
  Presenter {

  private lateinit var glide: GlideRequests

  override fun setGlide(glideRequests: GlideRequests) {
    this.glide = glideRequests
  }

  override fun bindView(view: PhotosView, compositeDisposable: CompositeDisposable) {
    super.bindView(view, compositeDisposable)
    initView()

    Timber.d("binding view")
  }

  private fun initView() {
    getPhotos()
  }

  /**
   * getting photos from [PhotosService]
   * [Photo]s are then grouped by [Album.id] into [Album]s
   * and then converted into [AlbumItem] expected by [PhotosView]
   *
   * If error occurs it's is shown by [PhotosView]
   * */
  private fun getPhotos() {
    Timber.d("getting photos")
    photosService.getPhotos()
      .subscribeOn(Schedulers.io())
      .doOnSubscribe { view.showProgressBar() }
      .groupBy { it.albumId }
      .flatMapSingle { it.toList() }
      .map {
        val album = Album("Album ${it[0].albumId}", it[0].albumId, it)
        Pair(
          AlbumItem(album.name, album.id),
          album.photos.map { photo ->
            PhotoItem(
              photo.title,
              photo.thumbnailUrl,
              glide
            )
          }
        )
      }
      .observeOn(AndroidSchedulers.mainThread())
      .subscribeBy(onNext = {
        ExpandableGroup(it.first, false)
          .apply {
            add(Section(it.second))
            view.addToAdapter(this)
          }
        view.hideProgressBar()
      },
        onError = {
          Timber.d("error while getting photos: $it")
          view.showGettingPhotosError()
          view.hideProgressBar()
        }
      ).addTo(compositeDisposable)
  }

  override fun retryGetPhotos() {
    Timber.d("retry getting photos")
    getPhotos()
  }
}