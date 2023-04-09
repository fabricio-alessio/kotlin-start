package com.book.variables

var opCount = 0
val immutable = 34
const val IMMUTABLE = 45

fun main() {

    performOperation()
    performOperation()
    println(opCount)
    println(immutable)
    println(IMMUTABLE)
}

fun performOperation() {
    opCount++
}