package com.book.lambda

fun main() {

    val books = listOf(
        Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")))

    println(books.flatMap { it.authors }.toSet())

}

class Book(val title: String, val authors: List<String>)