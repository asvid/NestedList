[io.github.asvid.nestedlist.ui.photoslist](./index.md)

## Package io.github.asvid.nestedlist.ui.photoslist

### Types

| Name | Summary |
|---|---|
| [PhotosFragment](-photos-fragment/index.md) | `class PhotosFragment : `[`BaseFragment`](../io.github.asvid.nestedlist.ui/-base-fragment/index.md)`, `[`PhotosView`](-photos-view/index.md)<br>Fragment containing [Photo](#)s list, it extends [BaseFragment](../io.github.asvid.nestedlist.ui/-base-fragment/index.md) and [PhotosView](-photos-view/index.md) |
| [PhotosPresenter](-photos-presenter/index.md) | `class PhotosPresenter : `[`BasePresenter`](../io.github.asvid.nestedlist.ui.mvp/-base-presenter/index.md)`<`[`PhotosView`](-photos-view/index.md)`>, `[`Presenter`](-presenter/index.md)<br>Concrete presenter for [Photo](#) list view It extends [Presenter](-presenter/index.md) from [PhotosListContract](#) and [BasePresenter](../io.github.asvid.nestedlist.ui.mvp/-base-presenter/index.md) that handles view binding |
| [PhotosView](-photos-view/index.md) | `interface PhotosView : `[`MvpView`](../io.github.asvid.nestedlist.ui.mvp/-mvp-view.md)<br>Contract contains interfaces for MVP View and Presenter |
| [Presenter](-presenter/index.md) | `interface Presenter : `[`MvpPresenter`](../io.github.asvid.nestedlist.ui.mvp/-mvp-presenter/index.md)`<`[`PhotosView`](-photos-view/index.md)`>` |
