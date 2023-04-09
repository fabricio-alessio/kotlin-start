package com.book.controlStructs

fun main() {

    println("GREEN RGB ${Color.GREEN.rgb()}")
    println("GREEN mnemonic ${getMnemonic(Color.GREEN)}")
    println("RED mnemonic ${Color.RED.mnemonic()}")
    println("VIOLET warmth ${getWarmth(Color.VIOLET)}")
    println("Mix YELLOW and BLUE is ${mix(Color.YELLOW, Color.BLUE)}")
    println("Mix YELLOW and BLUE is ${mixPrep(Color.YELLOW, Color.BLUE)}")
    println("Mix YELLOW and BLUE is ${mixOptimized(Color.YELLOW, Color.BLUE)}")

    val value = eval(Sum(Num(7), Sum(Num(1), Num(2))))
    println("7 + (1 + 2) = $value")
    val value2 = evalLog(Sum(Num(7), Sum(Num(1), Num(2))))
    println("7 + (1 + 2) = $value2")
}