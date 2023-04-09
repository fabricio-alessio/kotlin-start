package com.site.kotlinstart

fun testaSistema() {

    val felipe = Cliente(nome = "Felipe", senha = 123)

    val sistema = SistemaInterno()
    sistema.registra(felipe, 123)

    val denis = Diretor(nome = "Denis", cpf = "111.111.111-04", salario = 12.34, senha = 124, plr = 33.2)
    sistema.registra(denis, 123)
}