[io.github.asvid.nestedlist.appservices.photos](../index.md) / [PhotosService](./index.md)

# PhotosService

`interface PhotosService` [(source)](https://github.com/asvid/NestedList/tree/master/app/src/main/java/io/github/asvid/nestedlist/appservices/photos/PhotosService.kt#L10)

App service for obtaining and manipulating [Photo](../../io.github.asvid.nestedlist.domain/-photo/index.md)s
For the moment used only for getting [Photo](../../io.github.asvid.nestedlist.domain/-photo/index.md)s

### Functions

| Name | Summary |
|---|---|
| [getPhotos](get-photos.md) | `abstract fun getPhotos(): `[`Flowable`](http://reactivex.io/RxJava/javadoc/io/reactivex/Flowable.html)`<`[`Photo`](../../io.github.asvid.nestedlist.domain/-photo/index.md)`>`<br>gets [Photo](../../io.github.asvid.nestedlist.domain/-photo/index.md)s from API |

### Inheritors

| Name | Summary |
|---|---|
| [PhotosServiceImpl](../-photos-service-impl/index.md) | `class PhotosServiceImpl : `[`PhotosService`](./index.md) |
