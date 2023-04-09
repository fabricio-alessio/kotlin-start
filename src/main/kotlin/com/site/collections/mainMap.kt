package com.site.collections

fun main() {

    val map = mapOf("key" to 42)

    val value1 = map["key"]                                     // 1
    val value2 = map["key2"]                                    // 2

    val value3: Int = map.getValue("key")                       // 1

    val mapWithDefault = map.withDefault { k -> k.length }
    val value4 = mapWithDefault.getValue("key2")                // 3

    try {
        map.getValue("anotherKey")                              // 4
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }

    val map_1 = mutableMapOf<String, Int?>()
    println(map_1.getOrElse("x") { 1 })       // 1

    map_1["x"] = 3
    println(map_1.getOrElse("x") { 1 })       // 2

    map_1["x"] = null
    println(map_1.getOrElse("x") { 1 })       // 3
}