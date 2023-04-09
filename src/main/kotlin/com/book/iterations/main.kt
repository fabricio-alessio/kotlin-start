package com.book.iterations

import java.util.*

fun main() {

    for (i in 1..10) print("$i ")
    println()
    for (i in 1 until 10) print("$i ")
    println()
    for (i in 10 downTo 1) print("$i ")
    println()
    for (i in 10 downTo 1 step 2) print("$i ")
    println()

    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'H') {
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps) {
        println("$letter: $binary")
    }

    val list = arrayListOf("10", "11", "1112")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}