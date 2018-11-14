package io.github.asvid.nestedlist.di.components

import dagger.Module
import dagger.Subcomponent
import dagger.android.AndroidInjector
import io.github.asvid.nestedlist.MainActivity

@Subcomponent(modules = [MainActivityComponent.MainActivityModule::class])
interface MainActivityComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()

    @Module
    abstract class MainActivityModule

}