package com.book.lambda

fun main() {

    val runnable = Runnable { println("All done") }

    runnable.run()
}