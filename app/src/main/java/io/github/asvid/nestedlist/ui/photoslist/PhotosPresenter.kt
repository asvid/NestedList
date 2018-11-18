package io.github.asvid.nestedlist.ui.photoslist

import com.xwray.groupie.ExpandableGroup
import com.xwray.groupie.Section
import io.github.asvid.nestedlist.appservices.photos.PhotosService
import io.github.asvid.nestedlist.domain.Album
import io.github.asvid.nestedlist.ui.mvp.BasePresenter
import io.github.asvid.nestedlist.ui.photoslist.list.AlbumItem
import io.github.asvid.nestedlist.ui.photoslist.list.PhotoItem
import io.github.asvid.nestedlist.utils.GlideRequests
import io.github.asvid.nestedlist.utils.subscribeWithErrorLogging
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

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

  private fun getPhotos() {
    Timber.d("getting photos")
    photosService.getPhotos()
      .subscribeOn(Schedulers.io())
      .doOnSubscribe { view.showProgressBar() }
      .doOnError {
        view.showGettingPhotosError()
      }
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
      .subscribeWithErrorLogging {
        Timber.d("new album: $it")
        ExpandableGroup(it.first, false)
          .apply {
            add(Section(it.second))
            view.addToAdapter(this)
          }
        view.hideProgressBar()
      }.addTo(compositeDisposable)
  }

  override fun retryGetPhotos() {
    Timber.d("retry getting photos")
    getPhotos()
  }
}