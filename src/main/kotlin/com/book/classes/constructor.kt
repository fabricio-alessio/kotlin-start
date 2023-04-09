package com.book.classes

import kotlin.properties.Delegates

fun main() {
    println(User1("babu").nickname)
    println(User2("bidu").nickname)
    println(User3("shampoo").nickname)
    println(TwitterUser("tuiuiu").nickname)
    println(User4("gluglu").nickname)
    println(Button(1))
    println(Button("sifu"))
}

class User1 constructor(_nickname: String) {
    val nickname: String
    init {
        nickname = _nickname
    }
}

class User2(_nickname: String) {
    val nickname = _nickname
}

class User3(val nickname: String)

open class User4(val nickname: String)
class TwitterUser(nickname: String) : User4(nickname)

class User5(val nickname: String, val isSubscribed: Boolean = true)

open class View {
    constructor(label: String) {
        this.label = label
    }
    constructor(index: Int) {
        this.index = index
    }

    protected lateinit var label: String
    protected var index by Delegates.notNull<Int>()
}

class Button : View {
    constructor(label: String) : this(label, -1)
    constructor(index: Int) : super(index) {
        label = "Button label not defined"
    }
    constructor(label: String, index: Int) : super(label) {
        this.index = index
    }

    override fun toString(): String {
        return "$label $index"
    }
}