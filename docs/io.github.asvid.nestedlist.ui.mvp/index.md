[io.github.asvid.nestedlist.ui.mvp](./index.md)

## Package io.github.asvid.nestedlist.ui.mvp

### Types

| Name | Summary |
|---|---|
| [BasePresenter](-base-presenter/index.md) | `abstract class BasePresenter<V : `[`MvpView`](-mvp-view.md)`> : `[`MvpPresenter`](-mvp-presenter/index.md)`<`[`V`](-base-presenter/index.md#V)`>`<br>Base class that handles [MvpView](-mvp-view.md) and [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) binding so it doesn't have to be done in each [MvpPresenter](-mvp-presenter/index.md) |
| [MvpPresenter](-mvp-presenter/index.md) | `interface MvpPresenter<V : `[`MvpView`](-mvp-view.md)`>`<br>Interface to extend by concrete MVP presenter. It's binded with view extending [MvpView](-mvp-view.md) |
| [MvpView](-mvp-view.md) | `interface MvpView`<br>Interface for MVP view |
