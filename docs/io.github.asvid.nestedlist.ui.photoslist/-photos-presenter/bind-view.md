[io.github.asvid.nestedlist.ui.photoslist](../index.md) / [PhotosPresenter](index.md) / [bindView](./bind-view.md)

# bindView

`fun bindView(view: `[`PhotosView`](../-photos-view/index.md)`, compositeDisposable: `[`CompositeDisposable`](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) [(source)](https://github.com/asvid/NestedList/tree/master/app/src/main/java/io/github/asvid/nestedlist/ui/photoslist/PhotosPresenter.kt#L33)

Overrides [BasePresenter.bindView](../../io.github.asvid.nestedlist.ui.mvp/-base-presenter/bind-view.md)

Overrides [MvpPresenter.bindView](../../io.github.asvid.nestedlist.ui.mvp/-mvp-presenter/bind-view.md)

binds [MvpView](../../io.github.asvid.nestedlist.ui.mvp/-mvp-view.md) with [MvpPresenter](../../io.github.asvid.nestedlist.ui.mvp/-mvp-presenter/index.md), also provides [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) for presenter so it doesn't need to contain Fragment lifecycle

### Parameters

`view` -
* view to be binded with presenter instance

`compositeDisposable` -
* disposable bag to be cleared when view is destroyed, it's not created in [MvpPresenter](../../io.github.asvid.nestedlist.ui.mvp/-mvp-presenter/index.md) so it doesn't have to provide and handle lifecycle
