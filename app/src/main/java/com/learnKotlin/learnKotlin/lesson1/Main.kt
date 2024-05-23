package com.learnKotlin.learnKotlin.lesson1

import android.os.Looper

fun main(args:Array<String>){
    getData()

}

fun getData(){
    val fName="wafaa"
    val lName="Jame"
    val age=50
    // this first
    println("the name$fName")
    println("the last name$lName")
    println("the age$age")
    loop@ for (count1 in 1..5){
        for (count2 in 1..3){
            println("count1 is $count1, count2 is $count2")
            if(count2==2){
//                break@loop
                break
            }
        }
    }
    print("end of loop")
}