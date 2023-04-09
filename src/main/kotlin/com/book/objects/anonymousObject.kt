package com.book.objects

fun main() {


    val button = Button("Start")
    val mouse = Mouse(button.listener)
    println(button)
    mouse.doDown()
    println(button)
    mouse.doUp()
    println(button)
}

interface MouseAdapter {
    fun down()
    fun up()
}

class Mouse(private val adapter: MouseAdapter) {
    fun doDown() {
        adapter.down()
    }
    fun doUp() {
        adapter.up()
    }
}

class Button(private val label: String) {

    private var text = label
    val listener = object : MouseAdapter {
        override fun down() {
            text = ">$label<"
        }
        override fun up() {
            text = label
        }
    }

    override fun toString(): String {
        return "[$text]"
    }
}