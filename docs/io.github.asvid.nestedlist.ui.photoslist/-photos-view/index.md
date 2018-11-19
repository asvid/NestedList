[io.github.asvid.nestedlist.ui.photoslist](../index.md) / [PhotosView](./index.md)

# PhotosView

`interface PhotosView : `[`MvpView`](../../io.github.asvid.nestedlist.ui.mvp/-mvp-view.md) [(source)](https://github.com/asvid/NestedList/tree/master/app/src/main/java/io/github/asvid/nestedlist/ui/photoslist/PhotosListContract.kt#L12)

Contract contains interfaces for MVP View and Presenter

### Functions

| Name | Summary |
|---|---|
| [addToAdapter](add-to-adapter.md) | `abstract fun addToAdapter(expandableGroup: ExpandableGroup): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [hideProgressBar](hide-progress-bar.md) | `abstract fun hideProgressBar(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [showGettingPhotosError](show-getting-photos-error.md) | `abstract fun showGettingPhotosError(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [showProgressBar](show-progress-bar.md) | `abstract fun showProgressBar(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [PhotosFragment](../-photos-fragment/index.md) | `class PhotosFragment : `[`BaseFragment`](../../io.github.asvid.nestedlist.ui/-base-fragment/index.md)`, `[`PhotosView`](./index.md)<br>Fragment containing [Photo](#)s list, it extends [BaseFragment](../../io.github.asvid.nestedlist.ui/-base-fragment/index.md) and [PhotosView](./index.md) |
