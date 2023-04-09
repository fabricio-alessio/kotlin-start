package com.book.classes

fun main() {

    val client = Client("Joao", 883729292)
    println(client)

    val otherClient = Client("Joao", 83838292)
    val equalClient = Client("Joao", 883729292)
    println(client == otherClient)
    println(client == equalClient)

    val map = hashMapOf<Client, String>(client to "mamamia", otherClient to "paranormal", equalClient to "biscoito")
    println(map)
}

class Client(val name: String, val postCode: Int) {
    override fun toString() = "Client($name, $postCode)"
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name && postCode == other.postCode
    }

    override fun hashCode() = name.hashCode() * 31 + postCode
}
