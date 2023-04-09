package com.book.lambda

fun main() {

    val numbers = mapOf(0 to "zero", 1 to "one", 2 to "two")
    println(numbers.mapValues { it.value.uppercase() })
}