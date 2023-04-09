package com.book

fun main() {

    val set = setOf(1, 7, 53)
    println(set.javaClass)
    println(set.maxOrNull())

    val hashSet = hashSetOf(1, 7, 53)
    println(hashSet.javaClass)

    val arrayList = arrayListOf(1, 7, 53)
    println(arrayList.javaClass)
    println(arrayList.last())

    val hashMap = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-tree")
    println(hashMap.javaClass)
}