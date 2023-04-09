package com.book.types.nullable

fun main() {

    val email: String? = "tiago@gmail.com"
    email?.let { sendEmail(it) }

    val email2: String? = null
    email2?.let { sendEmail(it) }
}

fun sendEmail(email: String) {
    println("Sending email to $email")
}