package com.site.coroutine.dispatchers

import kotlinx.coroutines.ExecutorCoroutineDispatcher
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import java.util.concurrent.Executors

suspend fun main() {

    val dispatcher = Executors.newFixedThreadPool(3).asCoroutineDispatcher()

    val result = load(dispatcher)

    println(result)
}

suspend fun load(dispatcher: ExecutorCoroutineDispatcher): String {

    return withContext(dispatcher) {
        delay(2000)
        "test"
    }
}