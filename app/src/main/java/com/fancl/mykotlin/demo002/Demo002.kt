package com.fancl.mykotlin.demo002

import android.view.View


fun foo(x: Int) {
    println(x)
}

fun foo(x: Int, y: Int): Int {
    return x * y
}

//等号不需要 return
fun foo1(x: Int, y: Int) = x + y


val foo = { x: Int, y: Int -> x + y }

fun foo3(x: Int) = { y: Int -> x + y }

fun sum(x: Int, y: Int, z: Int) = x + y + z


//柯里化

fun sum(x: Int) = { y: Int ->
    { z: Int -> x + y + z }
}

var sum = 0


fun omitParenthese(block: () -> Unit) {
    block()
}


fun omitParenthese(content: String, block: (String) -> Unit) {
    block(content)
}


fun View.invisible() {
    visibility = View.INVISIBLE
}


fun <A, B> Array<A>.corresponds(that: Array<B>, p: (A, B) -> Boolean): Boolean {
    val i = this.iterator()
    val j = that.iterator()
    while (i.hasNext() && j.hasNext()) {
        if (!p(i.next(), j.next())) {
            return false
        }
    }
    return true
}

fun ifExpression(flag: Boolean) {
    val a = if (flag) "hhhhhhh" else "bbbb"
    println(a.toUpperCase())
}


fun main() {
    val result = foo.invoke(1, 2)
    print(result)
    print(foo3(1)(2))

    listOf<Int>(1, 2, 3).filter { it > 1 }.forEach { sum += it }
    println()
    print(sum)
    println()
    var funPrint = { x: Int -> println(x) }
    funPrint(1)

    println()
    print(sum(1)(2)(3))

    println()
    omitParenthese {
        println("hello world")
    }
    println()
    omitParenthese("my luck") {
        println("$it hello world")
    }


    listOf<View>().forEach { it.invisible() }

    val a = arrayOf(1, 2, 3)
    val b = arrayOf(2, 3, 4)
    val c = a.corresponds(b) { x, y ->
        x + 1 == y
    }
    println()
    println(c)

    var mybeInt: Int? = null
    var result22 =mybeInt ?: 2 + 1222
    print(result22)
}