package com.hmj.kotlin

fun max(a:Int, b:Int):Int = if (a > b) a else b
fun max2(a:Int, b:Int):Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun main(args:Array<String>) {
    println("Hello Kotlin!!!")
    println(max(2,4))
    println(max2(3,2 ))

    val immutable = "Car"
    println(immutable)

    val immutable2:String
    immutable2 = "Bus"
    println(immutable2)

    var mutable = 1
    mutable++
    println(mutable)
    println("Is mutable greater than 0? ${mutable > 0}")

}
