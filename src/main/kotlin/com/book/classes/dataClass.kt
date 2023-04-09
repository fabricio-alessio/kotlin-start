package com.book.classes

fun main() {

    val client = DataClient("Joao", 33839092)
    println(client)
    val otherClient = client.copy(postalCode = 87687633)
    println(otherClient)
}

data class DataClient(val name: String, val postalCode: Int)