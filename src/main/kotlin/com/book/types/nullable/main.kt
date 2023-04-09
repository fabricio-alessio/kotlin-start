package com.book.types.nullable

fun main() {

    // wont compile
    // strLen(null)

    println(strLenNullable(null))
    println(strLenNullable("123"))
    println(strLenDefault(null))
    println(strLenDefault("123"))

}

fun strLen(s: String) = s.length

fun strLenNullable(s: String?) = s?.length

fun strLenDefault(s: String?) = s?.length ?: 0
