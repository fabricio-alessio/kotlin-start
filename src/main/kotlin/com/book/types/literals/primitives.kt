package com.book.types.literals

fun main() {

    val l = 3L
    val d = 0.34
    val f = 34f
    val h = 0xCAAAAEF
    val b = 0b0000101
    val c = 'A'
    val tab = '\t'
    val tabUnicode = '\u0009'
    val s = "tess"

    val byte: Byte = 1
    val long = byte + 1L
    foo(42)

    val x = "234859".toInt()

}

fun foo(l: Long) = println(l)