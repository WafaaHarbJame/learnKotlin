package com.learnKotlin.learnKotlin.lesson2

import android.app.ProgressDialog.show
import java.util.Calendar

// reminder mode % ,  increment  and decrement in kotlin using ++a or a=a+1, --a,a=a-1
// convert data type in kotlin
// Math operation and math priorities { first from left to right ,1. between brackets()
// 2. ^  3.  *,/   multiplication and division  4. +,-  addition,subtraction  }
// conditional operator like > ,<,!=,==,>=,<=
//  simple if  statement
// if else statement
// if else if  statement
// Logical operator OR || , AND &&,  NOT !
//When
val obj = "Hello"

//when (obj) {
//    // Checks whether obj equals to "1"
//    "1" -> println("One")
//    // Checks whether obj equals to "Hello"
//    "Hello" -> println("Greeting")
//    // Default statement
//    else -> println("Unknown")
//}

// Greeting
//Use when when you have a conditional expression with multiple branches.
//when can be used either as a statement or as an expression.
// when expression as switch  case in java for example   val testNum=4
//    when (testNum) {
//        1 -> println("one")
//        2 -> println("two")
//        3 -> println("two")
//        4 -> println("four")
//        5 -> println("five")
//        else -> println("out of range")
//    }

// for loop  for(any variable in from number to number  ){}  for example    for(i in 1..6){
//        println("i is $i")
//    }
// when have two loop first execute the first loop in outer then all loop in inner then complete the outer then inner again
// like    for (count1 in 1..5){
//        for (count2 in 1..3){
//            println("count1 is $count1, count2 is $count2")
//        }
//    }
//    print("end of loop")



// while loop
// var i = 0
//    while (i <= 5) {
//        println(i)
//        i++
//    }
//    println("out")

// do while Loop for example      var i = 0
//    do {
//        println(i)
//        i++ // without increment make infinite loop
//    } while (i < 5)
//    println("out of range")
// functions with return and without return, without return mean return Unit like void in java
// to call main function just calling  main with args , but with args maina
// variable scope Global "outside of function :public " and local " inside function private" as public and private
//get year from computer calender for example to get year Calendar.getInstance().get(Calendar.YEAR)
// loop control  use break in loop to end the loop with condition for example
//for (i in 1..10) {
//    if (i == 5) {
//        // break
//        continue
//    }
//    println("i is $i")
//}
//  to stop loop according condition using break and continue using continue" negate condition" and not print 5 when make
// continue
// using  loop@ to make break to specific for with adding loop@ to for and adding break@loop
// , as example     loop@ for (count1 in 1..5){
//        for (count2 in 1..3){
//            println("count1 is $count1, count2 is $count2")
//            if(count2==2){
////                break@loop
//                break
//            }
//        }
//    }
// you can rename to any not as loop@ you can name it mainLoop@

// strings as sentence not only one word
fun main() {

}


