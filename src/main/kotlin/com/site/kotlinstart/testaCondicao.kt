package com.site.kotlinstart

fun testaCondicao(saldo: Double) {

    when {
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("Conta neutra")
        else -> println("Conta negativa")
    }
}