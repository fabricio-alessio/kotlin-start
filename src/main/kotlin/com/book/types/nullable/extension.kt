package com.book.types.nullable

fun main() {

    verifyUserInput(null)

    verifyUserInput("Enter")

    val strNull: String? = null
    if (strNull.isNull()) {
        println("strNull is null!")
    }
}

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill input")
    } else {
        println("Done $input")
    }
}

fun String?.isNull(): Boolean = this == null