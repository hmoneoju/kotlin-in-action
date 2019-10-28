@file:JvmName("StringFunctions")
package com.hmj.kotlin

import strings.joinToString

fun main() {
    val set = hashSetOf("A", "B", "C")
    val list = listOf("A", "B", "B", "C")
    val map = mapOf("A" to "A", "B" to "B")

    println("Set ${joinToString(set, separator = "#", prefix = "{",  suffix = "}")}")
    println("List ${joinToString(list)}")
    println("Map $map")
}