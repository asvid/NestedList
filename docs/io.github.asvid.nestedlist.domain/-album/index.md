[io.github.asvid.nestedlist.domain](../index.md) / [Album](./index.md)

# Album

`data class Album` [(source)](https://github.com/asvid/NestedList/tree/master/app/src/main/java/io/github/asvid/nestedlist/domain/Album.kt#L11)

Domain class for album in [PhotosResponse](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Album(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, photos: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`Photo`](../-photo/index.md)`> = mutableListOf())`<br>Domain class for album in [PhotosResponse](#) |

### Properties

| Name | Summary |
|---|---|
| [id](id.md) | `val id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<ul><li>ID of album</li></ul> |
| [name](name.md) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<ul><li>album name created from [id](id.md)</li></ul> |
| [photos](photos.md) | `val photos: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`Photo`](../-photo/index.md)`>`<ul><li>mutable list of [Photo](../-photo/index.md)s</li></ul> |
