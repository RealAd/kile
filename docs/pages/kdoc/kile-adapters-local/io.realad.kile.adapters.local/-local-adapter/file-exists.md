---
title: io.realad.kile.adapters.local.LocalAdapter.fileExists - kile-adapters-local
---

[kile-adapters-local](../../index.html) / [io.realad.kile.adapters.local](../index.html) / [LocalAdapter](index.html) / [fileExists](./file-exists.html)

# fileExists

(common, js, jvm) `fun fileExists(path: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Either<FilesystemError, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`

Check if the file exists at the specified path.

### Parameters

`path` - the path to the file.

**Return**
true if the file exists, or false if not, either return an error.

