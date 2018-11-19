[io.github.asvid.nestedlist.domain](../index.md) / [Photo](./index.md)

# Photo

`data class Photo` [(source)](https://github.com/asvid/NestedList/tree/master/app/src/main/java/io/github/asvid/nestedlist/domain/Photo.kt#L12)

Domain class for [PhotosResponse](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Photo(thumbnailUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, photoUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, albumId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, photoId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Domain class for [PhotosResponse](#) |

### Properties

| Name | Summary |
|---|---|
| [albumId](album-id.md) | `val albumId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<ul><li>ID of album, albums are separate domain objects</li></ul> |
| [photoId](photo-id.md) | `val photoId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<ul><li>ID of photo</li></ul> |
| [photoUrl](photo-url.md) | `val photoUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<ul><li>url of photo in full size</li></ul> |
| [thumbnailUrl](thumbnail-url.md) | `val thumbnailUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<ul><li>url of thumbnail 150x150px</li></ul> |
| [title](title.md) | `val title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<ul><li>title of photo</li></ul> |
