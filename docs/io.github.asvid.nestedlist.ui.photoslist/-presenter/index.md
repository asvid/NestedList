[io.github.asvid.nestedlist.ui.photoslist](../index.md) / [Presenter](./index.md)

# Presenter

`interface Presenter : `[`MvpPresenter`](../../io.github.asvid.nestedlist.ui.mvp/-mvp-presenter/index.md)`<`[`PhotosView`](../-photos-view/index.md)`>` [(source)](https://github.com/asvid/NestedList/tree/master/app/src/main/java/io/github/asvid/nestedlist/ui/photoslist/PhotosListContract.kt#L19)

### Functions

| Name | Summary |
|---|---|
| [retryGetPhotos](retry-get-photos.md) | `abstract fun retryGetPhotos(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setGlide](set-glide.md) | `abstract fun setGlide(glideRequests: GlideRequests): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inherited Functions

| Name | Summary |
|---|---|
| [bindView](../../io.github.asvid.nestedlist.ui.mvp/-mvp-presenter/bind-view.md) | `abstract fun bindView(view: `[`V`](../../io.github.asvid.nestedlist.ui.mvp/-mvp-presenter/index.md#V)`, compositeDisposable: `[`CompositeDisposable`](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>binds [MvpView](../../io.github.asvid.nestedlist.ui.mvp/-mvp-view.md) with [MvpPresenter](../../io.github.asvid.nestedlist.ui.mvp/-mvp-presenter/index.md), also provides [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) for presenter so it doesn't need to contain Fragment lifecycle |

### Inheritors

| Name | Summary |
|---|---|
| [PhotosPresenter](../-photos-presenter/index.md) | `class PhotosPresenter : `[`BasePresenter`](../../io.github.asvid.nestedlist.ui.mvp/-base-presenter/index.md)`<`[`PhotosView`](../-photos-view/index.md)`>, `[`Presenter`](./index.md)<br>Concrete presenter for [Photo](#) list view It extends [Presenter](./index.md) from [PhotosListContract](#) and [BasePresenter](../../io.github.asvid.nestedlist.ui.mvp/-base-presenter/index.md) that handles view binding |
