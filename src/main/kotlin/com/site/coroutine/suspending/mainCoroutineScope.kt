package com.site.coroutine.suspending

import kotlinx.coroutines.*
import kotlin.system.*

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        println("The answer is ${concurrentSum()}")
    }
    println("Completed in $time ms")
}

suspend fun concurrentSum(): Int = coroutineScope {
    val one = async { doSomethingUsefulOne3() }
    val two = async { doSomethingUsefulTwo3() }
    one.await() + two.await()
}

suspend fun doSomethingUsefulOne3(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
}

suspend fun doSomethingUsefulTwo3(): Int {
    delay(2000L) // pretend we are doing something useful here, too
    return 29
}