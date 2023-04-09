package com.book.function

import com.book.function.string.last
import com.book.function.string.join
import com.book.function.string.lastChar as last

fun main() {

    println("Mama mia".last())

    var sentence = listOf("Mama", "mia", "sua", "linda").join(" ", suffix = "!")
    println(sentence)

    println(sentence.last)
}
