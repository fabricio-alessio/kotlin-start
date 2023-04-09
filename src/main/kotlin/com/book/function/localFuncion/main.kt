package com.book.function.localFuncion

fun main() {

    someFunction("Um parametro", "Outro parametro")
}

fun someFunction(param1: String, param2: String) {
    fun validation(value: String) {
        if (value.length < 5) {
            throw IllegalArgumentException()
        }
    }

    validation(param1)
    validation(param2)

    println("$param1 $param2")
}