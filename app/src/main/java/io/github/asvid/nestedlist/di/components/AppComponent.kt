package io.github.asvid.nestedlist.di.components

import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import io.github.asvid.nestedlist.App
import io.github.asvid.nestedlist.di.ActivityBinder
import io.github.asvid.nestedlist.di.FragmentBinder
import io.github.asvid.nestedlist.di.modules.ApiModule
import io.github.asvid.nestedlist.di.modules.AppModule
import io.github.asvid.nestedlist.di.modules.AppServiceModule
import io.github.asvid.nestedlist.di.modules.PresenterModule
import javax.inject.Singleton

@Singleton
@Component(
  modules = [
    AndroidSupportInjectionModule::class,
    ActivityBinder::class,
    FragmentBinder::class,
    AppModule::class,
    ApiModule::class,
    AppServiceModule::class,
    PresenterModule::class
  ]
)
interface AppComponent {

  fun inject(app: App)

  @Component.Builder
  interface Builder {

    @BindsInstance
    fun application(app: App): Builder

    fun build(): AppComponent
  }
}