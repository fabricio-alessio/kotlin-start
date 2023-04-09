package com.site.kotlinstart

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Autenticavel {

    override val bonificacao: Double get() = salario *.2 + salario

    fun funBonificacao(): Double = salario * .2

    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}