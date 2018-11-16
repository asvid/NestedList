package io.github.asvid.nestedlist.views

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
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

    val glide = GlideApp.with(this@MainActivity)

    photosService.getPhotos()
      .subscribeOn(Schedulers.io())
      .doOnSubscribe { photos_progressbar.visibility = View.VISIBLE }
      .doOnError {
        photos_progressbar.visibility = View.GONE
        Toast.makeText(this, "There was an error, try again", Toast.LENGTH_LONG).show()
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
        ExpandableGroup(it.first, false)
          .apply {
            add(Section(it.second))
            groupAdapter.add(this)
          }
        photos_progressbar.visibility = View.GONE
      }


    photos_list_recyclerView.apply {
      layoutManager = LinearLayoutManager(this@MainActivity)
      adapter = groupAdapter
      addItemDecoration(MarginItemDecoration(resources.getDimension(R.dimen.default_padding).toInt()))
      setHasFixedSize(true)
      setItemViewCacheSize(300)
    }


  }
}
