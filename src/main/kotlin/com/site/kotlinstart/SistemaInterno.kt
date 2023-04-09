package com.site.kotlinstart

class SistemaInterno {

    fun registra(admin: Autenticavel, senha: Int) {

        if (admin.autentica(senha)) {
            println("Bem vindo!")
        } else {
            println("Falha na autenticação")
        }
    }
}