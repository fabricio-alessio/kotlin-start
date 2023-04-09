package com.site.function

fun main() {

    val ints = arrayOf(1,2,3,4,5)

    var sum = 0
    ints.filter { it > 0 }.forEach {
        sum += it
    }
    print(sum)

}