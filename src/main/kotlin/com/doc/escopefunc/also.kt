package com.doc.escopefunc

import kotlin.random.Random

fun main() {

    val i = getRandomInt()
    println(i)
}

fun getRandomInt(): Int {
    return Random.nextInt(100).also {
        writeToLog("getRandomInt() generated value $it")
    }
}

fun writeToLog(s: String) {
    println(s)
}
