package com.book.fields

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}