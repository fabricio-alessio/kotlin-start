package com.site.kotlinstart

fun criaContas() {
    val contaAlex = Conta("Alex", 1)
    val contaFran = Conta(numero = 2, titular = "Fran")

    contaAlex.print()
    contaFran.print()

    contaAlex.deposita(5.0)
    contaAlex.print()
    contaAlex.saca(4.0)
    contaAlex.print()

    if (contaAlex.transfere(1.0, contaFran)) {
        println("Dinheiro transferido")
    } else {
        println("Transferência inválida")
    }

    contaAlex.print()
    contaFran.print()
    println("Saldo da conta do Alex: ${contaAlex.saldo}")
}
