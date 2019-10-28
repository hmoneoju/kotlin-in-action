package com.hmj.kotlin

import java.lang.IllegalArgumentException

interface Expr
class Num(val value:Double) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(expr: Expr) : Double =
    when(expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
        else -> throw  IllegalArgumentException("Unknown expression")
    }

fun main() {
    println(eval(Sum(Sum(Num(1.0), Num(2.0)), Num(4.0))))
}