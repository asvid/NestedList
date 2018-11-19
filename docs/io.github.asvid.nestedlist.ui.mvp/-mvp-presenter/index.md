[io.github.asvid.nestedlist.ui.mvp](../index.md) / [MvpPresenter](./index.md)

# MvpPresenter

`interface MvpPresenter<V : `[`MvpView`](../-mvp-view.md)`>` [(source)](https://github.com/asvid/NestedList/tree/master/app/src/main/java/io/github/asvid/nestedlist/ui/mvp/MvpPresenter.kt#L8)

Interface to extend by concrete MVP presenter. It's binded with view extending [MvpView](../-mvp-view.md)

### Functions

| Name | Summary |
|---|---|
| [bindView](bind-view.md) | `abstract fun bindView(view: `[`V`](index.md#V)`, compositeDisposable: `[`CompositeDisposable`](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>binds [MvpView](../-mvp-view.md) with [MvpPresenter](./index.md), also provides [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) for presenter so it doesn't need to contain Fragment lifecycle |

### Inheritors

| Name | Summary |
|---|---|
| [BasePresenter](../-base-presenter/index.md) | `abstract class BasePresenter<V : `[`MvpView`](../-mvp-view.md)`> : `[`MvpPresenter`](./index.md)`<`[`V`](../-base-presenter/index.md#V)`>`<br>Base class that handles [MvpView](../-mvp-view.md) and [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) binding so it doesn't have to be done in each [MvpPresenter](./index.md) |
| [Presenter](../../io.github.asvid.nestedlist.ui.photoslist/-presenter/index.md) | `interface Presenter : `[`MvpPresenter`](./index.md)`<`[`PhotosView`](../../io.github.asvid.nestedlist.ui.photoslist/-photos-view/index.md)`>` |
