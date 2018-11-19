[io.github.asvid.nestedlist.ui.mvp](../index.md) / [MvpPresenter](index.md) / [bindView](./bind-view.md)

# bindView

`abstract fun bindView(view: `[`V`](index.md#V)`, compositeDisposable: `[`CompositeDisposable`](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) [(source)](https://github.com/asvid/NestedList/tree/master/app/src/main/java/io/github/asvid/nestedlist/ui/mvp/MvpPresenter.kt#L16)

binds [MvpView](../-mvp-view.md) with [MvpPresenter](index.md), also provides [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) for presenter so it doesn't need to contain Fragment lifecycle

### Parameters

`view` -
* view to be binded with presenter instance

`compositeDisposable` -
* disposable bag to be cleared when view is destroyed, it's not created in [MvpPresenter](index.md) so it doesn't have to provide and handle lifecycle
