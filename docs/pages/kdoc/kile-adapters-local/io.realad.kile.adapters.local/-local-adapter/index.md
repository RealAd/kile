---
title: io.realad.kile.adapters.local.LocalAdapter - kile-adapters-local
---

[kile-adapters-local](../../index.html) / [io.realad.kile.adapters.local](../index.html) / [LocalAdapter](./index.html)

# LocalAdapter

(common, js, jvm) `class LocalAdapter : KileAdapter`

An adapter for accessing the local file system.

### Constructors

| (common, js, jvm) [&lt;init&gt;](-init-.html) | An adapter for accessing the local file system.`<init>(fileUtils: `[`FileUtils`](../-file-utils/index.html)`)` |

### Functions

| (common, js, jvm) [fileExists](file-exists.html) | Check if the file exists at the specified path.`fun fileExists(path: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Either<FilesystemError, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| (common, js, jvm) [listContents](list-contents.html) | Return a list of contents at the specified path.`fun listContents(path: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Either<FilesystemError, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<KileAttributes>>` |

