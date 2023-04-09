package com.book.packages

import com.book.packages.shapes.createBox
import com.book.packages.shapes.createRect

fun main() {

    val box = createBox(30)
    println("Box is square ${box.isSquare}")
    println("Box size ${box.height}")

    val rect = createRect(10, 15)
    println("Rect is square ${rect.isSquare}")
}