package com.site.function

fun main() {

    println(2 vezes 5 menos 5 vezes 3 mais 12 divididoPor 4)
}

infix fun Int.vezes(x: Int): Int {
    return this * x
}

infix fun Int.menos(x: Int): Int {
    return this - x
}

infix fun Int.mais(x: Int): Int {
    return this + x
}

infix fun Int.divididoPor(x: Int): Int {
    return this / x
}