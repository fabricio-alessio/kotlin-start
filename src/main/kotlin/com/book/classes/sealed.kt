package com.book.classes

fun main() {

    val result = eval(Expr.Sum(Expr.Num(9), Expr.Sum(Expr.Num(2), Expr.Num(1))))
    println(result)
}

// usada em conjunção com when para não precisar de default.
sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right:Expr) : Expr()
}

fun eval(e: Expr): Int = when (e) {
    is Expr.Num -> e.value
    is Expr.Sum -> eval(e.right) + eval(e.left)
}

