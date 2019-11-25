package com.fancl.mykotlin.demo003

import android.graphics.Color


class Bird (val weight:Double, val age:Int, val color:String="9xxxx")
{

    lateinit var height:String
//
//    init {
//       this.age = if(this.color =="yellow") 12 else 30
//    }

    fun printHeight(){
        this.height = if(color =="yellow") "private lateinit var name: String" else "12222"
    }

    val sex:String by lazy {
        if(color =="yellow") "male" else "man"
    }

}


