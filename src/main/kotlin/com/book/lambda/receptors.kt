package com.book.lambda

fun main() {

    val text = with(StringBuilder()) {
        this.append("One ")
        this.append("Two ")
        this.append("Tree ")
        toString()
    }

    println(text)
    println(text())

    val sb = StringBuilder().apply {
        append("One ")
        append("Two ")
        append("Tree ")
    }
    println(sb.toString())

    val otherText = buildString {
        append("One ")
        append("Two ")
        append("Tree ")
    }
    println(otherText)
}

fun text() = with(StringBuilder()) {
    append("One ")
    append("Two ")
    append("Tree ")
    toString()
}