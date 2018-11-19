[io.github.asvid.nestedlist.ui.mvp](../index.md) / [BasePresenter](./index.md)

# BasePresenter

`abstract class BasePresenter<V : `[`MvpView`](../-mvp-view.md)`> : `[`MvpPresenter`](../-mvp-presenter/index.md)`<`[`V`](index.md#V)`>` [(source)](https://github.com/asvid/NestedList/tree/master/app/src/main/java/io/github/asvid/nestedlist/ui/mvp/BasePresenter.kt#L9)

Base class that handles [MvpView](../-mvp-view.md) and [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) binding so it doesn't have to be done in each [MvpPresenter](../-mvp-presenter/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BasePresenter()`<br>Base class that handles [MvpView](../-mvp-view.md) and [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) binding so it doesn't have to be done in each [MvpPresenter](../-mvp-presenter/index.md) |

### Properties

| Name | Summary |
|---|---|
| [compositeDisposable](composite-disposable.md) | `lateinit var compositeDisposable: `[`CompositeDisposable`](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) |
| [view](view.md) | `lateinit var view: `[`V`](index.md#V) |

### Functions

| Name | Summary |
|---|---|
| [bindView](bind-view.md) | `open fun bindView(view: `[`V`](index.md#V)`, compositeDisposable: `[`CompositeDisposable`](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>binds [MvpView](../-mvp-view.md) with [MvpPresenter](../-mvp-presenter/index.md), also provides [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) for presenter so it doesn't need to contain Fragment lifecycle |

### Inheritors

| Name | Summary |
|---|---|
| [PhotosPresenter](../../io.github.asvid.nestedlist.ui.photoslist/-photos-presenter/index.md) | `class PhotosPresenter : `[`BasePresenter`](./index.md)`<`[`PhotosView`](../../io.github.asvid.nestedlist.ui.photoslist/-photos-view/index.md)`>, `[`Presenter`](../../io.github.asvid.nestedlist.ui.photoslist/-presenter/index.md)<br>Concrete presenter for [Photo](#) list view It extends [Presenter](../../io.github.asvid.nestedlist.ui.photoslist/-presenter/index.md) from [PhotosListContract](#) and [BasePresenter](./index.md) that handles view binding |
