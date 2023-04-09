package com.book.lambda

fun main() {

    println("Will compute ...")
    postponeComputation(500) { println("computed")}
}

fun postponeComputation(delay: Long, computation: Runnable) {
    Thread.sleep(delay)
    computation.run()
}