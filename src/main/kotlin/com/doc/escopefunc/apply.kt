package com.doc.escopefunc

data class Person2(var name: String, var age: Int = 0, var city: String = "")

fun main() {

    val adam = Person2("Adam").apply {
        age = 20                       // same as this.age = 20
        city = "London"
    }
    println(adam)
}