package com.book.lambda

import com.book.function.string.joinToString

fun main() {

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxByOrNull { it.age })
    println(people.maxByOrNull { p: Person -> p.age })
    println(people.maxByOrNull { p -> p.age })
    println(people.maxByOrNull() { p -> p.age })

    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))

    val pr = { println(42) }
    pr()

    val names = people.joinToString(
        separator = " ",
        transform = { p -> p.name }
    )
    println(names)

    val names2 = people.joinToString(" ") { it.name }
    println(names2)

    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
    println(list.map { it * it })

    val maxAge = people.maxByOrNull(Person::age)!!.age
    println(people.filter { it.age == maxAge })
}

data class Person(val name: String, val age: Int)