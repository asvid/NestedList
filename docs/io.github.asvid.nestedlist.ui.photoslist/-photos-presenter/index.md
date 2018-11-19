[io.github.asvid.nestedlist.ui.photoslist](../index.md) / [PhotosPresenter](./index.md)

# PhotosPresenter

`class PhotosPresenter : `[`BasePresenter`](../../io.github.asvid.nestedlist.ui.mvp/-base-presenter/index.md)`<`[`PhotosView`](../-photos-view/index.md)`>, `[`Presenter`](../-presenter/index.md) [(source)](https://github.com/asvid/NestedList/tree/master/app/src/main/java/io/github/asvid/nestedlist/ui/photoslist/PhotosPresenter.kt#L24)

Concrete presenter for [Photo](#) list view
It extends [Presenter](../-presenter/index.md) from [PhotosListContract](#) and [BasePresenter](../../io.github.asvid.nestedlist.ui.mvp/-base-presenter/index.md) that handles view binding

### Parameters

`photosService` -
* app service for obtaining [Photo](#)s

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PhotosPresenter(photosService: `[`PhotosService`](../../io.github.asvid.nestedlist.appservices.photos/-photos-service/index.md)`)`<br>Concrete presenter for [Photo](#) list view It extends [Presenter](../-presenter/index.md) from [PhotosListContract](#) and [BasePresenter](../../io.github.asvid.nestedlist.ui.mvp/-base-presenter/index.md) that handles view binding |

### Inherited Properties

| Name | Summary |
|---|---|
| [compositeDisposable](../../io.github.asvid.nestedlist.ui.mvp/-base-presenter/composite-disposable.md) | `lateinit var compositeDisposable: `[`CompositeDisposable`](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) |
| [view](../../io.github.asvid.nestedlist.ui.mvp/-base-presenter/view.md) | `lateinit var view: `[`V`](../../io.github.asvid.nestedlist.ui.mvp/-base-presenter/index.md#V) |

### Functions

| Name | Summary |
|---|---|
| [bindView](bind-view.md) | `fun bindView(view: `[`PhotosView`](../-photos-view/index.md)`, compositeDisposable: `[`CompositeDisposable`](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>binds [MvpView](../../io.github.asvid.nestedlist.ui.mvp/-mvp-view.md) with [MvpPresenter](../../io.github.asvid.nestedlist.ui.mvp/-mvp-presenter/index.md), also provides [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) for presenter so it doesn't need to contain Fragment lifecycle |
| [retryGetPhotos](retry-get-photos.md) | `fun retryGetPhotos(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setGlide](set-glide.md) | `fun setGlide(glideRequests: GlideRequests): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
