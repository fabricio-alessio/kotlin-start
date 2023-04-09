package com.book.objects

import com.book.classes.getFacebookName

fun main() {

    val user1 = User.newSubscribingUser("jonh@gmail.com")
    val user2 = User.newFacebookUser(34535656)

    println(user1.nickname)
    println(user2.nickname)

    val person1 = Person.Loader.fromJson("john")
    val person2 = Person.fromJson("johny")
    println(person1.name)
    println(person2.name)

    val persons = loadFromJson(CompPerson, listOf("Maria", "Joao", "Pedro", "Mateus"))
    persons.forEach { println(it.name) }

    val person = ThePerson.fromJson("Camila")
    println(person)
}

class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))
    }
}

class Person(val name: String) {
    companion object Loader {
        fun fromJson(jsonText: String): Person {
            return Person(jsonText)
        }
    }
}

interface JsonFactory<T> {
    fun fromJson(jsonText: String): T
}

class CompPerson(val name: String) {
    companion object : JsonFactory<CompPerson> {
        override fun fromJson(jsonText: String): CompPerson {
            return CompPerson(jsonText)
        }
    }
}

fun <T> loadFromJson(factory: JsonFactory<T>, jsons: List<String>): List<T> {
    return jsons.map { factory.fromJson(it) }
}

data class ThePerson(val name: String, val lastName: String) {
    companion object
}

fun ThePerson.Companion.fromJson(json: String) = ThePerson(json, "Silva")
