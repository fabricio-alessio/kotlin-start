package com.book.function.string

fun String.lastChar(): Char = this[this.length - 1]

val String.last: Char
    get() = this[length - 1]

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    suffix: String = ""
) = joinToString(separator, prefix, suffix)

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    suffix: String = ""
): String {
    var result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(suffix)
    return result.toString()
}