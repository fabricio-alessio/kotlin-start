package com.book.types.nullable

fun main() {

    showProgress(400)

    val value: Int? = null
    // showProgress(value!!) null pointer exception

    val i = 1
    val l: Long = i.toLong()

    val list = listOf(1L, 2L, 3L)
    // i in list wont compile
    val inside = i.toLong() in list
    println(inside)
}

fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("We're $percent% done!")
}