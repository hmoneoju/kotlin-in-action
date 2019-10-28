package com.hmj.kotlin

// Enum
enum class WeekendDays (
    val short: String, val long: String
) {
    SATURDAY("SAT", "Monday"),
    SUNDAY("TUE", "Tuesday");

}

fun isSaturday(weekendDays: WeekendDays) : Boolean {
    return when(weekendDays) {
        WeekendDays.SATURDAY -> true
        WeekendDays.SUNDAY -> false
    }
}

fun main() {
    val saturday = WeekendDays.SATURDAY
    println("Is $saturday ${isSaturday(saturday)}")
}

