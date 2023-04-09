package com.book.fields

fun main() {

    val person = Person("Luis", false)
    println(person.name)
    println(person.isBlocked)

    val rect = Rectangle(10, 10)
    println("Rectangle is square ${rect.isSquare}")
}