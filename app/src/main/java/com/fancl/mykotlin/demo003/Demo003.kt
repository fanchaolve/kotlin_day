package com.fancl.mykotlin.demo003


enum class Day {
    Mon,
    Tue
}

enum class DayofWeek(val day: Int) {
    Mon(1),
    Tue(2),
    Two(3);

    fun getDayNumber(): Int {
        return day
    }
}

fun schedule(sunny: Boolean, day: Day) = when (day) {
    Day.Mon -> println("mon")
    Day.Tue -> println("tue")
    else -> when {
        sunny -> println("sunny")
        else -> println("else")
    }
}

fun foo(a: Int) = when (a) {
    1 -> 1
    2 -> 2
    else -> 0


}

fun main() {

    for (i in 1..10) {
        print(i)
    }

    var result = "kot" in "abc".."xyz"
    println(result)
}