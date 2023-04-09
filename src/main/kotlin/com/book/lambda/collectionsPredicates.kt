package com.book.lambda

fun main() {

    val canBeInClub27 = { p: Person -> p.age <= 27 }
    val people = listOf(Person("Alice", 27), Person("Janifer", 20), Person("Bob", 31))

    println("All people bellow to club 27          : ${people.all(canBeInClub27)}")
    println("At least one person bellow to club 27 : ${people.any(canBeInClub27)}")
    println("Count of people that bellow to club 27: ${people.count(canBeInClub27)}")
    println("First person that bellow to club 27   : ${people.find(canBeInClub27)}")
    println("All people that bellow to club 27     : ${people.filter(canBeInClub27)}")
}