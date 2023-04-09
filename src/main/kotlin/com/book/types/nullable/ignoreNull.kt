package com.book.types.nullable

fun main() {

    // will throw null pointer exception
    ignoreNulls(null)
}

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}