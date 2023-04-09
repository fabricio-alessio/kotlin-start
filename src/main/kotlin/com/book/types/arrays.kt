package com.book.types

fun main() {

    val letters = Array<String>(26) { i -> ('a' + i).toString() }
    println(letters.joinToString("."))

    // collection into varargs
    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))

    val fiveZeros = IntArray(5)
    val fiveZerosToo = intArrayOf(0, 0, 0, 0, 0)

    val squares = IntArray(19) { i -> (i+1) * (i+1) }
    println(squares.joinToString())

    squares.forEachIndexed { index, element ->
        println("square of ${index+1} is $element")
    }
}