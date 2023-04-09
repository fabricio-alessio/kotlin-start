package com.book.types.nullable

fun main() {

    val person = Person("Dmitry");
    println(person.countryName())
    printShippingLabel(person)
}

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person(val name: String, val company: Company? = null)

fun Person.countryName(): String {
    return company?.address?.country ?: "Unknown"
}

fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No address")
    with (address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}
