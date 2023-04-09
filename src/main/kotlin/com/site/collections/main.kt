package com.site.collections

fun main() {

    val list = IntArray(10)
    list[0] = 3
    list[1] = 5
    list[3] = 78

    for (item in list) {
        println("Item $item")
    }

    val listInt = intArrayOf(12, 3, 55, 66)

    listInt.forEach { item ->
        println("Item int $item")
    }

    val listDouble = doubleArrayOf(23.4, 566.3)
    println("list double ${listDouble.contentToString()}")

    for (i in listDouble.indices) {
        println("Item double ${listDouble[i]}")
    }

    listDouble.forEachIndexed { i, item ->
        listDouble[i] = item * 2
    }
    println("list double * 2 -> ${listDouble.contentToString()}")

    val contatos: Array<String> = Array(3) { "" }
    contatos[0] = "Roberto"
    contatos[1] = "Ana"
    contatos[2] = "Paula"

    val contatos2 = arrayOf("Roberto", "Ana", "Paula")

    val listContatos = ArrayList<String>()
    listContatos.add("Joao")
    listContatos.add("Maria")

    val range = 1.rangeTo(10)
    for (r in range) {
        println(r)
    }
    for ((index, r) in range.withIndex()) {
        println("index $index value $r")
    }
    range.forEach { v -> println(v) }

    val even = 0..100 step 2
    even.forEach {n -> println(n)}

    for (v in 4..45 step 3) {
        println(v)
    }

    for (v in 30 downTo 3 step 10) {
        println(v)
    }

    val intervalo = 10.4 .. 30.2
    if (13.2 in intervalo) {
        println("Dentro do intervalo")
    }

    val alfabeto = 'a' .. 'z'
    println('k' in alfabeto)

    val values = arrayOf(34, 55, 4, 346, 33, 32)
    println(values.average())
    println(values.sum())

    val users = mutableListOf<String>()
    users.add("Joao")
    users.add("Maria")
    val usersGet: List<String> = users
    usersGet.forEach {u -> println(u)}

    val issues = mutableSetOf<String>()
    println(issues.add("teste"))
    println(issues.add("teste2"))
    println(issues.add("teste2"))

    val map = mutableMapOf<String, String>()
    map.put("um", "val1")
    map.putIfAbsent("um", "valor1")
    map.put("dois", "val2")
    map.forEach { t, u -> println("$t -> $u") }

    val imutableMap = mapOf<Int, String>(1 to "um", 2 to "dois")
    imutableMap.forEach { t, u -> println("$t -> $u") }

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0 }

    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { it * 3 }

    val anyNegative = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it > 6 }

    val allEven = numbers.all { it % 2 == 0 }
    val allLess6 = numbers.all { it < 6 }

    val allEven2 = numbers.none { it % 2 == 1 }
    val allLess6_2 = numbers.none { it > 6 }

    val firstE = numbers.first()
    val lastE = numbers.last()

    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 != 0 }

    val totalCount = numbers.count()
    val evenCount = numbers.count { it % 2 == 0 }

    val evenOdd = numbers.partition { it % 2 == 0 }
    val (positives_2, negatives_2) = numbers.partition { it > 0 }
    println("evenOdd $evenOdd")
    println("positives $positives_2 , negatives $negatives_2")

    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

    val first = words.find { it.startsWith("some") }
    val last = words.findLast { it.startsWith("some") }
    val nothing = words.find { it.contains("nothing") }

    val fruitsBag = listOf("apple","orange","banana","grapes")  // 1
    val clothesBag = listOf("shirts","pants","jeans")           // 2
    val cart = listOf(fruitsBag, clothesBag)                    // 3
    val mapBag = cart.map { it }                                // 4
    val flatMapBag = cart.flatMap { it }                        // 5
    println("cart       -> $cart")
    println("mapBag     -> $mapBag")
    println("flatMapBag -> $flatMapBag")

    val numbers2 = listOf(1, 2, 3)
    val empty = emptyList<Int>()
    val only = listOf(3)

    println("Numbers: $numbers2, min = ${numbers2.minOrNull()} max = ${numbers2.maxOrNull()}") // 1
    println("Empty: $empty, min = ${empty.minOrNull()}, max = ${empty.maxOrNull()}")        // 2
    println("Only: $only, min = ${only.minOrNull()}, max = ${only.maxOrNull()}")            // 3

    val shuffled = listOf(5, 4, 2, 1, 3, -10)                   // 1
    val natural = shuffled.sorted()                             // 2
    val inverted = shuffled.sortedBy { -it }                    // 3
    val descending = shuffled.sortedDescending()                // 4

    println("shuffled   $shuffled")
    println("natural    $natural")
    println("inverted   $inverted")
    println("descending $descending")

    val list_1 = listOf(0, 10, 20)
    println(list_1.getOrElse(1) { 42 })    // 1
    println(list_1.getOrElse(10) { 42 })   // 2

}