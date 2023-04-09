package com.book.types.nullable

fun main() {

    val list = mutableListOf<Int?>()
    list.add(4)
    list.add(null)
    list.add(49)

    val notNullList = list.filterNotNull()

    println("list $list")
    println("not null list $notNullList")


}
