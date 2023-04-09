package com.book.lambda

fun main() {

    val errors = listOf("403 Forbidden", "404 Not found", "500 Internal server error")
    printMessagesWithPrefix(errors, "Error:")
    printProblemCounts(errors)
}

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}