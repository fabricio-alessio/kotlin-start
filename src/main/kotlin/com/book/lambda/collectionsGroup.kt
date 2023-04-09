package com.book.lambda

fun main() {

    val people = listOf(Person("Alice", 27), Person("Janifer", 20), Person("Bob", 20))
    println(people.groupBy { it.age })
}