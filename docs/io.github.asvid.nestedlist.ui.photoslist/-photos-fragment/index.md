[io.github.asvid.nestedlist.ui.photoslist](../index.md) / [PhotosFragment](./index.md)

# PhotosFragment

`class PhotosFragment : `[`BaseFragment`](../../io.github.asvid.nestedlist.ui/-base-fragment/index.md)`, `[`PhotosView`](../-photos-view/index.md) [(source)](https://github.com/asvid/NestedList/tree/master/app/src/main/java/io/github/asvid/nestedlist/ui/photoslist/PhotosFragment.kt#L26)

Fragment containing [Photo](#)s list, it extends [BaseFragment](../../io.github.asvid.nestedlist.ui/-base-fragment/index.md) and [PhotosView](../-photos-view/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PhotosFragment()`<br>Fragment containing [Photo](#)s list, it extends [BaseFragment](../../io.github.asvid.nestedlist.ui/-base-fragment/index.md) and [PhotosView](../-photos-view/index.md) |

### Properties

| Name | Summary |
|---|---|
| [presenter](presenter.md) | `lateinit var presenter: `[`Presenter`](../-presenter/index.md)<ul><li>injected by Dagger [Presenter](../-presenter/index.md) object</li></ul> |

### Inherited Properties

| Name | Summary |
|---|---|
| [compositeDisposable](../../io.github.asvid.nestedlist.ui/-base-fragment/composite-disposable.md) | `val compositeDisposable: `[`CompositeDisposable`](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html)<ul><li>disposable bag cleaned when fragment is paused</li></ul> |

### Functions

| Name | Summary |
|---|---|
| [addToAdapter](add-to-adapter.md) | `fun addToAdapter(group: ExpandableGroup): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [hideProgressBar](hide-progress-bar.md) | `fun hideProgressBar(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onCreateView](on-create-view.md) | `fun onCreateView(inflater: `[`LayoutInflater`](https://developer.android.com/reference/android/view/LayoutInflater.html)`, container: `[`ViewGroup`](https://developer.android.com/reference/android/view/ViewGroup.html)`?, savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`View`](https://developer.android.com/reference/android/view/View.html)`?` |
| [onResume](on-resume.md) | `fun onResume(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [showGettingPhotosError](show-getting-photos-error.md) | `fun showGettingPhotosError(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [showProgressBar](show-progress-bar.md) | `fun showProgressBar(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inherited Functions

| Name | Summary |
|---|---|
| [onAttach](../../io.github.asvid.nestedlist.ui/-base-fragment/on-attach.md) | `open fun onAttach(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Dagger injection |
| [onPause](../../io.github.asvid.nestedlist.ui/-base-fragment/on-pause.md) | `open fun onPause(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>cleaning [compositeDisposable](../../io.github.asvid.nestedlist.ui/-base-fragment/composite-disposable.md) |
