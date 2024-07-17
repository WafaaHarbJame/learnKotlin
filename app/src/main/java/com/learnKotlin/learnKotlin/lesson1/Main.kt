package com.learnKotlin.learnKotlin.lesson1

import android.os.Looper
import kotlin.math.PI

fun main(args:Array<String>){

    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))

    println(circleArea(2))

//    val button = "A"
//    when(button){
//        "A" -> print("Yes")
//        "B" ->print("No")
//        "X" ->print("Menu")
//        "Y" ->print("Nothing")
//        else ->{
//            print(" There is no such button")
//        }
//
//
//    }



//    val words = listOf("dinosaur", "limousine", "magazine", "language")
//    for ( word in words){
//        if(word.startsWith('l')){
//            println(word)
//        }
//    }

//    for (number in 1..100) {
//        when{
//            number % 3==0 &&  number % 5==0 ->println("fizzbuzz")
//            number % 3==0 ->println("fizz")
//            number % 5==0 ->println("buzz")
//            else ->{
//              println("$number")
//            }
//        }
//    }


//        for (number in 1..100) {
//            println(
//                when {
//                    number % 15 == 0 -> "fizzbuzz"
//                    number % 3 == 0 -> "fizz"
//                    number % 5 == 0 -> "buzz"
//                    else -> "$number"
//                }
//            )
//
//
//    }




    var pizzaSlices = 0
    while ( pizzaSlices < 7 ) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    fun main() {
        var pizzaSlices = 0
        while ( pizzaSlices < 7 ) {
            pizzaSlices++
            println("There's only $pizzaSlices slice/s of pizza :(")
        }
        pizzaSlices++
        println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
    }

//    var pizzaSlices = 0
//    while (pizzaSlices<8){
//        pizzaSlices++
//        println("using while There's only $pizzaSlices slice/s of pizza :(")
//
//    }
//    do {
//        println("using do while There's only $pizzaSlices slice/s of pizza :(")
//        pizzaSlices++
//
//    }while (pizzaSlices<8)

   // getData()
//    val readOnlyJuiceMenu = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
//    readOnlyJuiceMenu["banana"] = 180
//    println(readOnlyJuiceMenu.keys)

// [apple, kiwi, orange]
//    println(readOnlyJuiceMenu.values)
// [100, 190, 100]
//
//    val greenNumbers = listOf(1, 4, 23)
//    val redNumbers = listOf(17, 2)
//    val totalCount = greenNumbers.count() + redNumbers.count()
//    println("AllList size is ${greenNumbers.size.plus(redNumbers.size)}")
//    println("totalCount is $totalCount")
//    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
//    val requested = "smtp"
//    val isSupported =requested.uppercase() in SUPPORTED
//        println("Support for $requested: $isSupported")
//    val number2word = mutableMapOf( 1 to "one" , 2 to "two",  3 to "three")
//    val n = 2
//    println("$n is spelt as '${number2word[n]}'")
}


// circleArea as a single-expression function.
fun circleArea(radius:Int):Double=PI * radius * radius

fun intervalInSeconds(hours: Int=0, minutes: Int=0, seconds: Int=0) =
    ((hours * 60) + minutes) * 60 + seconds


//Lambda expression

fun uppercaseString(text: String): String {
    return text.uppercase()
}
//Can also be written as a lambda expression:

//Lambda expressions are written within curly braces {}.
//println({ text: String -> text.uppercase() }("hello"))
// HELLO

//the parameters followed by an ->.

//the function body after the ->.

//If you declare a lambda without parameters, then there is no need to use ->. For example:
//{ println("Log message") }





//fun circleArea(radius: Int): Double {
//    return PI * radius * radius
//}

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




    val button = "A"
    when(button){
        "A" ->print("Yes")
        "B" ->print("No")
        "X" ->print("Menu")
        "Y" ->print("Nothing")
        else ->{
            print(" There is no such button")
        }


    }

    println(
        // Write your code here
    )



    fun circleArea(radius:Int):Double {
        // Write your code here
        val area= PI * radius * radius
        return area
    }
}