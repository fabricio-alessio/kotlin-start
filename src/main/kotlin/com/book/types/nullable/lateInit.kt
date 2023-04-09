package com.book.types.nullable

fun main() {

    val test = MyTest()
    test.init() // comment to see lateinit exception
    test.testAction()
}

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private lateinit var myService: MyService
    fun init() {
        myService = MyService()
    }
    fun testAction() = myService.performAction()
}