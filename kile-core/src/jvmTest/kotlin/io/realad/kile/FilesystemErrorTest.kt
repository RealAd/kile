package io.realad.kile

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.realad.kile.error.FilesystemError

class FilesystemErrorTest : StringSpec({

    "should return original message" {
        val error = FilesystemError("hello error")
        error.getMessage() shouldBe "hello error"
        error.getPrevious() shouldBe null
    }

    "should return previous error if exists" {
        val error = FilesystemError("hello error", FilesystemError("previous error"))
        error.getPrevious() shouldNotBe null
        error.getPrevious()?.getMessage() shouldBe "previous error"
    }

})
