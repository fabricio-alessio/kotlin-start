package com.site.kotlinstart

fun testaContas() {

    val conta = Conta(
        titular = "Fred",
        numero = 2999
    )

    val contaCorrente = ContaCorrente(
        titular = "Amauri",
        numero = 4444
    )

    contaCorrente.deposita(34.0)

    contaCorrente.transfere(33.0, conta)

    conta.print()
    contaCorrente.print()
}