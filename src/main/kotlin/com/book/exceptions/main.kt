package com.book.exceptions

import java.io.BufferedReader
import java.io.StringReader

fun main() {

    val reader = BufferedReader(StringReader("Not a number"))
    println(readNumber(reader))

    val percentage = 102
    if (percentage !in 1..100) {
        throw IllegalArgumentException("A percentage must be between 1 and 100")
    }

    val number = 34
    val percent =
        if (number in 1..100)
            number
        else
            throw IllegalArgumentException("A percentage must be between 1 and 100")


}

fun readNumber(reader: BufferedReader): Int? {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    return number
}
