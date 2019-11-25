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

fun printLetters(vararg  letters:String,count:Int):Unit{
    print("$count letters are")
    for (letter in letters){
        print(letter)
    }
}

fun main() {

    for (i in 1..10) {
        print(i)
    }

    var result = "kot" in "abc".."xyz"
    println(result)

    printLetters("1","2","3","4",count = 4)

    val letters = arrayOf("a","b","c","d")
    printLetters(*letters,count = 3)
    println()
    val person = Person()
    person called "show"

    val str ="hello,world"
//    str.length
//    str.substring(0,5)
//    str+"hello Kotlin"
//    str.replace("world","kotlin")
//    str.isBlank()

    var r =str.filter { s-> s in 'a'..'f' }
    println(r)


    val bird = Bird()
    println(bird.color+bird.age)

}

class Person{
    infix fun called(name:String){
        println("my name is $name")
    }
}