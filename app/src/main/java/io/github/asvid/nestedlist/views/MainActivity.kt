package io.github.asvid.nestedlist.views

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.xwray.groupie.ExpandableGroup
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Section
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import dagger.android.AndroidInjection
import io.github.asvid.nestedlist.R
import io.github.asvid.nestedlist.appservices.photos.PhotosService
import io.github.asvid.nestedlist.domain.Album
import io.github.asvid.nestedlist.utils.GlideApp
import io.github.asvid.nestedlist.utils.MarginItemDecoration
import io.github.asvid.nestedlist.utils.subscribeWithErrorLogging
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

  @Inject
  lateinit var photosService: PhotosService

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val groupAdapter = GroupAdapter<ViewHolder>()

    photosService.getPhotos()
      .subscribeOn(Schedulers.io())
      .groupBy { it.albumId }
      .flatMapSingle { it.toList() }
      .observeOn(AndroidSchedulers.mainThread())
      .subscribeWithErrorLogging {
        val album = Album("Album ${it[0].albumId}", it[0].albumId, it)

        ExpandableGroup(
          AlbumItem(album.name, album.id), false
        )
          .apply {
            add(
              Section(
                album.photos.map { it ->
                  PhotoItem(
                    it.title,
                    it.photoId,
                    it.thumbnailUrl,
                    it.photoUrl,
                    GlideApp.with(this@MainActivity)
                  )
                }
              )
            )
            groupAdapter.add(this)
          }
      }


    photos_list_recyclerView.apply {
      layoutManager = LinearLayoutManager(this@MainActivity)
      adapter = groupAdapter
      addItemDecoration(MarginItemDecoration(resources.getDimension(R.dimen.default_padding).toInt()))
    }


  }
}
