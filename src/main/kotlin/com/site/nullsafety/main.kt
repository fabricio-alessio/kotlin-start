package com.site.nullsafety

// https://kotlinlang.org/docs/null-safety.html#nullable-types-and-non-null-types

fun main() {

    var b: String? = "abc" // can be set to null
    b = null // ok
    println(b)

    val l = if (b != null) b.length else -1
    println(l)
}