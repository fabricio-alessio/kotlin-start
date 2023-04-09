package com.book.lambda

import java.io.File

fun main() {

    val people = listOf(Person("Alice", 27), Person("Janifer", 20), Person("Bob", 31))
    println(people.map(Person::name).filter { it.startsWith("A") })

    println(people.asSequence().map(Person::name).filter { it.startsWith("A") }.toList())

    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())

    val file = File("/Users/svtk/.HiddenDir/a.txt")
    println(file.isInsideHiddenDirectory())
}

fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }
