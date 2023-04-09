package com.site.scope

// https://kotlinlang.org/docs/scope-functions.html

fun main() {

    val str = "uma string"
    str.run { println("test $this") }

    val res = str.let { "let it be ($it)" }
    println("result: $res")

    val ret = "este".let { "eh um $it" }
    println("A soma do $ret")

    var test: String?
  //  test = "um teste"
   // println("Um teste $test")
}