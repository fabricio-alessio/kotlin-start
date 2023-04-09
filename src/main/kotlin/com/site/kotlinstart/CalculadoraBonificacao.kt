package com.site.kotlinstart

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        println("Bonificação ${funcionario.nome} = ${funcionario.bonificacao}")
        total += funcionario.bonificacao
    }
}