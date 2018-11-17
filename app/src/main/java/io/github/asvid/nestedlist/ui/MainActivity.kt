package io.github.asvid.nestedlist.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import io.github.asvid.nestedlist.R
import io.github.asvid.nestedlist.ui.photoslist.PhotosFragment

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    showFragment()
  }

  private fun showFragment() {
    val fm = supportFragmentManager
    fm.beginTransaction()
      .add(R.id.content_view, PhotosFragment())
      .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
      .commit()
  }
}
