package com.doc.escopefunc

fun main() {

    var person = Person("John", 34, "New York")
    with(person) {
        println("Name: $name")
        println("Age:  $age")
        println("City: $city")
    }

    person.apply {
        name = "Maria"
        age = 23
        city = "New Orleans"
    }

    var p = person.run {
        println("Name $name, age $age, city $city")
        name = "Marcos"
        person
    }

    p.let {
        println("Name ${it.name}, age ${it.age}, city ${it.city}")
    }

    var newPerson = person.run {
        Person(name, age + 1, city)
    }

    println("Name ${newPerson.name}, age ${newPerson.age}, city ${newPerson.city}")
}