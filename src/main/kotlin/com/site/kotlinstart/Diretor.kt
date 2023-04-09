package com.site.kotlinstart

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Autenticavel {

    override val bonificacao: Double get() = salario *.5 + salario + plr

    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}