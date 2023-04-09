package com.book.types.nullable

fun main() {

    printHashCode("asdf")
    printHashCode(null)

    printNotNullHashCode("asdf")
    // printNotNullHashCode(null) // wont compile
}

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun <T: Any> printNotNullHashCode(t: T) {
    println(t.hashCode())
}
