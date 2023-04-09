package com.book.classes

fun main() {
    println(NicknameUser("moreia@gmail.com").nickname)

    val user = LogUser("Octavious")
    user.address = "Av. Suave"
    user.address = "Rua das ostras"

    val counter = LengthCounter()
    counter.addWord("A word")
    println(counter.counter)
    counter.addWord("Another word")
    println(counter.counter)
}

interface UserEmail {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}

class NicknameUser(override val email: String) : UserEmail

class LogUser(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value" 
                """.trimIndent())
            field = value
        }
}

class LengthCounter {
    var counter: Int = 0
        private set
    fun addWord(word: String) {
        counter += word.length
    }
}