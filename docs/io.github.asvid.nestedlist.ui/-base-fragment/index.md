[io.github.asvid.nestedlist.ui](../index.md) / [BaseFragment](./index.md)

# BaseFragment

`abstract class BaseFragment : Fragment` [(source)](https://github.com/asvid/NestedList/tree/master/app/src/main/java/io/github/asvid/nestedlist/ui/BaseFragment.kt#L13)

Base Fragment class that handles initialization and cleaning of [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) and Dagger injection

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BaseFragment()`<br>Base Fragment class that handles initialization and cleaning of [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) and Dagger injection |

### Properties

| Name | Summary |
|---|---|
| [compositeDisposable](composite-disposable.md) | `val compositeDisposable: `[`CompositeDisposable`](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html)<ul><li>disposable bag cleaned when fragment is paused</li></ul> |

### Functions

| Name | Summary |
|---|---|
| [onAttach](on-attach.md) | `open fun onAttach(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Dagger injection |
| [onPause](on-pause.md) | `open fun onPause(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>cleaning [compositeDisposable](composite-disposable.md) |

### Inheritors

| Name | Summary |
|---|---|
| [PhotosFragment](../../io.github.asvid.nestedlist.ui.photoslist/-photos-fragment/index.md) | `class PhotosFragment : `[`BaseFragment`](./index.md)`, `[`PhotosView`](../../io.github.asvid.nestedlist.ui.photoslist/-photos-view/index.md)<br>Fragment containing [Photo](#)s list, it extends [BaseFragment](./index.md) and [PhotosView](../../io.github.asvid.nestedlist.ui.photoslist/-photos-view/index.md) |
