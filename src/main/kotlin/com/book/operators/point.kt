package com.book.operators

fun main() {

    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    println(p1 * 3.0)
    println(p1 * 5)
    println('c' * 3)

    val (x, y) = p1
    println("Point($x,$y)")
}

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Point.times(scale: Int): Point {
    return Point(x * scale, y * scale)
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun Point.component1() = x

operator fun Point.component2() = y
