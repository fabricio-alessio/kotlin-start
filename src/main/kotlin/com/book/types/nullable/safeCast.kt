package com.book.types.nullable

fun main() {

    val p1 = PersonE("Dmitry", "Jemerov")
    val p2 = PersonE("Dmitry", "Jemerov")
    println(p1 == p2)
}

class PersonE(val firstName: String, val lastName: String) {
    override fun equals(o: Any?): Boolean {
        val otherPerson = o as? PersonE ?: return false
        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int =
        firstName.hashCode() * 37 + lastName.hashCode()
}