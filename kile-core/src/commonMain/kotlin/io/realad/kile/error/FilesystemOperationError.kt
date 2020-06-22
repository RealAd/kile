package io.realad.kile.error

/**
 * An abstraction of errors when working with the file system.
 */
abstract class FilesystemOperationError constructor(
    private val operation: Operation,
    message: String,
    previous: FilesystemError?
): FilesystemError(message, previous) {
    enum class Operation {
        READ,
        RETRIEVE_METADATA
    }

    fun getOperation(): Operation = operation
}
