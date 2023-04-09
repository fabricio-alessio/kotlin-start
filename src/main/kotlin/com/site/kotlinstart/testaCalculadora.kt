package com.site.kotlinstart

fun testaCalculadora() {
    val calculadora = CalculadoraBonificacao()

    val alex = Analista(
        nome = "Fred",
        cpf = "123.456.789-01",
        salario = 12.9
    )

    calculadora.registra(alex)

    val fran = Gerente(nome = "Fran", cpf = "333.333.333-04", salario = 13.9, senha = 4)

    calculadora.registra(fran)

    val gui = Diretor(nome = "Gui", cpf = "444.444.444-03", salario = 15.5, senha = 5, plr = 23.2)

    calculadora.registra(gui)

    println("Total de bonificação: ${calculadora.total}")
}