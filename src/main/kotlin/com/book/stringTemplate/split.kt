package com.book.stringTemplate

fun main() {

    println("23.455.234-23".split(".", "-"))

    parsePath("/user/falessio/workspace/testes/filter.img")
}

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory name: $fileName extension: $extension")
}