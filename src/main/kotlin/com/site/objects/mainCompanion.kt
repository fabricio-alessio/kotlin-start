package com.site.objects

fun main() {


    val banco = BancoDeNomes()
    banco.salva("Alex")

    val banco2 = BancoDeNomes()
    banco2.salva("Lucila")

    println("Nomes: ${banco.nomes}")
}

