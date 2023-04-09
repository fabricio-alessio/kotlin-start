package com.site.coroutine.dispatchers

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() = runBlocking {

    val result = loadIO()

    println(result)
}

suspend fun loadIO(): String {

    return withContext(Dispatchers.IO) {
        delay(2000)
        "test"
    }
}