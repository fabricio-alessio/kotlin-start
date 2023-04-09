package com.book.controlStructs

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int = when(e) {
    is Num -> e.value
    is Sum -> eval(e.left) + eval(e.right)
    else -> throw IllegalArgumentException("Unknown expression")
}

fun evalLog(e: Expr): Int = when(e) {
    is Num -> {
        println("num: ${e.value}")
        e.value
    }
    is Sum -> {
        val l = evalLog(e.left)
        val r = evalLog(e.right)
        println("sum: $l + $r")
        l + r
    }
    else -> throw IllegalArgumentException("Unknown expression")
}
