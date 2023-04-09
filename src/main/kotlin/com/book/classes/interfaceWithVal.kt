package com.book.classes

fun main() {
    println(PrivateUser("moreia").nickname)
    println(SubscribingUser("moreia@gmail.com").nickname)
    println(FacebookUser(156336).nickname)
}

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(private val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(private val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)
}

fun getFacebookName(accountId: Int): String {
    return "Facebook-$accountId"
}
