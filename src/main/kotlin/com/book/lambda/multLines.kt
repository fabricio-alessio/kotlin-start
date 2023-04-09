package com.book.lambda

fun main() {

    val sum = { x: Int, y: Int ->
        println("Computing sum of $x and $y")
        x + y
    }

    println(sum(12, 45))
}