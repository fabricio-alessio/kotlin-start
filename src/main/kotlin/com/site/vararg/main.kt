package com.site.vararg

fun main() {

    println("list ${ asList(1, 2, 3)}")
}

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}
