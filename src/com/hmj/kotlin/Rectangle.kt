package com.hmj.kotlin

class Rectangle(val height: Double, val width: Double) {
    val isBig:Boolean
        get() {
            return area() > 10.0
        }

    fun area(): Double = height * width

    override fun toString(): String {
        return "Rectangle(height=$height,width=$width)"
    }
}

fun main(args: Array<String>) {
    val small = Rectangle(1.0, 2.0)
    println("Area of $small is ${small.area()}, which isBig=${small.isBig}")
}
