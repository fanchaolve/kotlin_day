package com.fancl.mykotlin.demo003

open class Animal{

    open fun fly(miles:Int){
        println("i can fly")
    }
}

class Pen:Animal(){

    override fun fly(miles:Int) {
        super.fly(miles)
    }
}
