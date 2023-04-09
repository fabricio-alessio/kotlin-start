package com.site.coroutine.scope

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

suspend fun main() {
    executeInParallel(
        listOf(
            Thing("um", 1000, 34),
            Thing("dois", 2500, 12),
            Thing("tres", 1422, 44),
        )
    )
}

suspend fun executeInParallel(elements: List<Thing>) = coroutineScope {

    val results = elements.map { async { doSomething(it) } }

    var total = 0
    results.forEach {
        total += it.await()
    }

    println("Total $total")
}

suspend fun doSomething(thing: Thing): Int {

    println("Start ${thing.name}")
    delay(thing.delay)
    println("Done ${thing.name}")
    return thing.result
}

data class Thing(val name: String, val delay: Long, val result: Int)