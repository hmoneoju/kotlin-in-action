package com.hmj.kotlin

import strings.joinToString

fun main() {
    val set = hashSetOf("A", "B", "C")
    val list = listOf("A", "B", "B", "C")
    val map = mapOf(1 to "A", 2 to "B") // to is an infix call equivalent to 1.to("A") i.e.

    println("Set ${joinToString(set, separator = "#", prefix = "{",  suffix = "}")}")
    println("List ${joinToString(list)}")
    println("Map $map")
}