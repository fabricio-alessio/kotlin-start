package com.site.kotlinstart

fun testaLaco() {
    for (i in 5 downTo -20) {
        val titular = "Alex$i"

        println("Titular1: $titular")

        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")

        testaCondicao(saldo)
        println()
    }
}