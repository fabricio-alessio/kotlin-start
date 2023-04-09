package com.book.operators

fun main() {

    val person = Person("Joao")
    println(person.emails)
}

class Person(val name: String) {
    val emails by lazy { loadEmails(this) }
}

fun loadEmails(person: Person): List<String> = listOf("test1", "test2")
