package com.book.types.literals

fun main() {

    // Any -> Object in Java
    val answer: Any = 42
    val n: Any? = null

    // Unit -> void in Java

}

interface Processor<T> {
    fun process(): T
}

class NoResultProcessor : Processor<Unit> {
    override fun process() {
        // do something
        // do not need to return something
    }
}