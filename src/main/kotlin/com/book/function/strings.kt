package com.book.function

fun main() {

    val list = listOf(1, 7, 53)
    println(joinToString(list, ":", "(", ")"))
    println(joinToString(list, separator = ":", prefix = "(", suffix = ")"))
    println(joinToString(list, separator = ":"))
    println(joinToString(list, prefix = "(", suffix = ")"))
}


fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    suffix: String = ""
): String {
    var result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(suffix)
    return result.toString()
}