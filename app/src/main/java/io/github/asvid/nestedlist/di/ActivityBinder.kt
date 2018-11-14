package io.github.asvid.nestedlist.di

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import io.github.asvid.nestedlist.MainActivity
import io.github.asvid.nestedlist.di.components.MainActivityComponent

@Module
abstract class
ActivityBinder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivityInjectorFactory(
        builder: MainActivityComponent.Builder
    ): AndroidInjector.Factory<out Activity>
}