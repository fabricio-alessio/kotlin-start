package com.book.packages.shapes

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createBox(size: Int) = Rectangle(size, size)

fun createRect(height: Int, width: Int) = Rectangle(height, width)