[io.github.asvid.nestedlist.ui.mvp](../index.md) / [BasePresenter](index.md) / [bindView](./bind-view.md)

# bindView

`open fun bindView(view: `[`V`](index.md#V)`, compositeDisposable: `[`CompositeDisposable`](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) [(source)](https://github.com/asvid/NestedList/tree/master/app/src/main/java/io/github/asvid/nestedlist/ui/mvp/BasePresenter.kt#L14)

Overrides [MvpPresenter.bindView](../-mvp-presenter/bind-view.md)

binds [MvpView](../-mvp-view.md) with [MvpPresenter](../-mvp-presenter/index.md), also provides [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) for presenter so it doesn't need to contain Fragment lifecycle

### Parameters

`view` -
* view to be binded with presenter instance

`compositeDisposable` -
* disposable bag to be cleared when view is destroyed, it's not created in [MvpPresenter](../-mvp-presenter/index.md) so it doesn't have to provide and handle lifecycle
