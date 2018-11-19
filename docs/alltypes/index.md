

### All Types

| Name | Summary |
|---|---|
| [io.github.asvid.nestedlist.di.ActivityBinder](../io.github.asvid.nestedlist.di/-activity-binder/index.md) |  |
| [io.github.asvid.nestedlist.domain.Album](../io.github.asvid.nestedlist.domain/-album/index.md) | Domain class for album in [PhotosResponse](#) |
| [io.github.asvid.nestedlist.ui.photoslist.list.AlbumItem](../io.github.asvid.nestedlist.ui.photoslist.list/-album-item/index.md) |  |
| [io.github.asvid.nestedlist.di.modules.ApiModule](../io.github.asvid.nestedlist.di.modules/-api-module/index.md) | Provides objects related to API, Http requests etc. |
| [io.github.asvid.nestedlist.App](../io.github.asvid.nestedlist/-app/index.md) |  |
| [io.github.asvid.nestedlist.di.components.AppComponent](../io.github.asvid.nestedlist.di.components/-app-component/index.md) |  |
| [io.github.asvid.nestedlist.di.modules.AppModule](../io.github.asvid.nestedlist.di.modules/-app-module/index.md) | Provides objects related to Android framework |
| [io.github.asvid.nestedlist.di.modules.AppServiceModule](../io.github.asvid.nestedlist.di.modules/-app-service-module/index.md) | Provides app services |
| [io.github.asvid.nestedlist.ui.BaseFragment](../io.github.asvid.nestedlist.ui/-base-fragment/index.md) | Base Fragment class that handles initialization and cleaning of [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) and Dagger injection |
| [io.github.asvid.nestedlist.ui.mvp.BasePresenter](../io.github.asvid.nestedlist.ui.mvp/-base-presenter/index.md) | Base class that handles [MvpView](../io.github.asvid.nestedlist.ui.mvp/-mvp-view.md) and [CompositeDisposable](http://reactivex.io/RxJava/javadoc/io/reactivex/disposables/CompositeDisposable.html) binding so it doesn't have to be done in each [MvpPresenter](../io.github.asvid.nestedlist.ui.mvp/-mvp-presenter/index.md) |
| [io.github.asvid.nestedlist.di.FragmentBinder](../io.github.asvid.nestedlist.di/-fragment-binder/index.md) |  |
| [io.github.asvid.nestedlist.utils.GlideModule](../io.github.asvid.nestedlist.utils/-glide-module/index.md) | [GlideModule](#) for Glide image library |
| [io.github.asvid.nestedlist.api.HttpClient](../io.github.asvid.nestedlist.api/-http-client/index.md) |  |
| [io.github.asvid.nestedlist.api.JsonPlaceholderService](../io.github.asvid.nestedlist.api/-json-placeholder-service/index.md) |  |
| [io.github.asvid.nestedlist.ui.MainActivity](../io.github.asvid.nestedlist.ui/-main-activity/index.md) |  |
| [io.github.asvid.nestedlist.di.components.MainActivityComponent](../io.github.asvid.nestedlist.di.components/-main-activity-component/index.md) |  |
| [io.github.asvid.nestedlist.utils.MarginItemDecoration](../io.github.asvid.nestedlist.utils/-margin-item-decoration/index.md) | [RecyclerView.ItemDecoration](#) used in [Photo](#) list |
| [io.github.asvid.nestedlist.ui.mvp.MvpPresenter](../io.github.asvid.nestedlist.ui.mvp/-mvp-presenter/index.md) | Interface to extend by concrete MVP presenter. It's binded with view extending [MvpView](../io.github.asvid.nestedlist.ui.mvp/-mvp-view.md) |
| [io.github.asvid.nestedlist.ui.mvp.MvpView](../io.github.asvid.nestedlist.ui.mvp/-mvp-view.md) | Interface for MVP view |
| [io.github.asvid.nestedlist.domain.Photo](../io.github.asvid.nestedlist.domain/-photo/index.md) | Domain class for [PhotosResponse](#) |
| [io.github.asvid.nestedlist.ui.photoslist.list.PhotoItem](../io.github.asvid.nestedlist.ui.photoslist.list/-photo-item/index.md) |  |
| [io.github.asvid.nestedlist.ui.photoslist.PhotosFragment](../io.github.asvid.nestedlist.ui.photoslist/-photos-fragment/index.md) | Fragment containing [Photo](#)s list, it extends [BaseFragment](../io.github.asvid.nestedlist.ui/-base-fragment/index.md) and [PhotosView](../io.github.asvid.nestedlist.ui.photoslist/-photos-view/index.md) |
| [io.github.asvid.nestedlist.di.components.PhotosFragmentComponent](../io.github.asvid.nestedlist.di.components/-photos-fragment-component/index.md) |  |
| [io.github.asvid.nestedlist.ui.photoslist.PhotosPresenter](../io.github.asvid.nestedlist.ui.photoslist/-photos-presenter/index.md) | Concrete presenter for [Photo](#) list view It extends [Presenter](../io.github.asvid.nestedlist.ui.photoslist/-presenter/index.md) from [PhotosListContract](#) and [BasePresenter](../io.github.asvid.nestedlist.ui.mvp/-base-presenter/index.md) that handles view binding |
| [io.github.asvid.nestedlist.api.response.PhotosResponse](../io.github.asvid.nestedlist.api.response/-photos-response/index.md) | Used to parse JSON answer from API |
| [io.github.asvid.nestedlist.appservices.photos.PhotosService](../io.github.asvid.nestedlist.appservices.photos/-photos-service/index.md) | App service for obtaining and manipulating [Photo](../io.github.asvid.nestedlist.domain/-photo/index.md)s For the moment used only for getting [Photo](../io.github.asvid.nestedlist.domain/-photo/index.md)s |
| [io.github.asvid.nestedlist.appservices.photos.PhotosServiceImpl](../io.github.asvid.nestedlist.appservices.photos/-photos-service-impl/index.md) |  |
| [io.github.asvid.nestedlist.ui.photoslist.PhotosView](../io.github.asvid.nestedlist.ui.photoslist/-photos-view/index.md) | Contract contains interfaces for MVP View and Presenter |
| [io.github.asvid.nestedlist.ui.photoslist.Presenter](../io.github.asvid.nestedlist.ui.photoslist/-presenter/index.md) |  |
| [io.github.asvid.nestedlist.di.modules.PresenterModule](../io.github.asvid.nestedlist.di.modules/-presenter-module/index.md) | Provides presenters for Fragments |
