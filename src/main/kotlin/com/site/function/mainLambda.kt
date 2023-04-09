package com.site.function

fun main() {

    val stringPlus: (String, String) -> String = String::plus
    val splus: String.(String) -> String = String::plus
    val intPlus: Int.(Int) -> Int = Int::plus

    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))
    println("Um ".splus("teste"))

    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(2.intPlus(3)) // extension-like call
}