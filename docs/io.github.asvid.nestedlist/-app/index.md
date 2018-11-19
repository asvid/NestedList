[io.github.asvid.nestedlist](../index.md) / [App](./index.md)

# App

`class App : `[`Application`](https://developer.android.com/reference/android/app/Application.html)`, HasActivityInjector, HasSupportFragmentInjector` [(source)](https://github.com/asvid/NestedList/tree/master/app/src/main/java/io/github/asvid/nestedlist/App.kt#L14)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `App()` |

### Properties

| Name | Summary |
|---|---|
| [dispatchingAndroidInjector](dispatching-android-injector.md) | `lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<`[`Activity`](https://developer.android.com/reference/android/app/Activity.html)`>` |
| [dispatchingFragmentInjector](dispatching-fragment-injector.md) | `lateinit var dispatchingFragmentInjector: DispatchingAndroidInjector<Fragment>` |

### Functions

| Name | Summary |
|---|---|
| [activityInjector](activity-injector.md) | `fun activityInjector(): AndroidInjector<`[`Activity`](https://developer.android.com/reference/android/app/Activity.html)`>` |
| [onCreate](on-create.md) | `fun onCreate(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [supportFragmentInjector](support-fragment-injector.md) | `fun supportFragmentInjector(): AndroidInjector<Fragment>` |
