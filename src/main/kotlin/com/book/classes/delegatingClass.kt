package com.book.classes

fun main() {

    val collection = DelegatingCollection(listOf("tenis", "sapato"))

    println(collection.toString())
    println(collection.toString())
    collection.forEach {item -> println(item)}

    val set = CountingSet<String>()
    set.add("malandro")
    set.addAll(collection)
    println(set)
}

class DelegatingCollection<T>(private val innerList: Collection<T> = ArrayList()) : Collection<T> by innerList {
    private var printCount = 0
    override fun toString(): String {
        printCount++
        return "${innerList.toString()} $printCount"
    }
}

class CountingSet<T>(private val innerSet: MutableCollection<T> = HashSet()) : MutableCollection<T> by innerSet {
    var objectsAdded = 0
    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }

    override fun toString(): String {
        return "${innerSet.toString()} size: $objectsAdded"
    }
}