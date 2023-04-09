package com.site.function

fun main() {
    println("max ${max(3, 6)}")
    println("maxv2 ${maxv2(3, 6)}")
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun maxv2(a: Int, b: Int) = if (a > b) a else b

