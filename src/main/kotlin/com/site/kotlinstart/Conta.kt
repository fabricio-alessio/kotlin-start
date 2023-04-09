package com.site.kotlinstart

open class Conta(val titular: String, val numero: Int, val inicial: Boolean = true) {
    var saldo = 0.0
        private set(valor) {
            if (valor > 0.0) {
                field = valor
            }
        }

    open fun deposita(valor: Double) {
        saldo += valor
    }

    open fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {

        if (valor > saldo) return false

        saca(valor)
        destino.deposita(valor)
        return true
    }

    fun print() {

        println("Titular: $titular")
        println("Número : $numero")
        println("Saldo  : $saldo")
        println("Inicial: $inicial")
        println()
    }
}