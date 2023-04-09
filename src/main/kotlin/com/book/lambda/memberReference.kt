package com.book.lambda

fun main() {

    val people = listOf(Person("Joao", 34), Person("Maria", 33))

    println(people.maxByOrNull(Person::age))

    run(::salute)

    println(people.maxByOrNull { it.age } )

    val action = ::salute
    run(action)

    val createPerson = ::Person
    val person = createPerson("Alice", 22)
    println(person)
}

fun salute() = println("Salute!")