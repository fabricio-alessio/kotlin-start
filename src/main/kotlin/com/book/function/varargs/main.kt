package com.book.function.varargs

fun main(args: Array<String>) {

    val list = listOf("Um", *args)
    println(list)

    println(varFunc("Um", "dois", "tres"))
}

fun varFunc(vararg args: String) = args.joinToString()