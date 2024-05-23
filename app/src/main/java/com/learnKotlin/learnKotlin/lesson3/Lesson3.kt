package com.learnKotlin.learnKotlin.lesson3

// array in kotlin
// creating array in kotlin with specific size , must defined size in this array
// for example var arrayName=Array<type of parameters inside array >(size){initial value for item in array  }  var arrayINt=Array<Int>(6){0}  and print array item using for loop    for (index in arrayINt){
//        println(arrayINt[index])
//    }

// another type of array is array list without estimate array size  and adding item to list using
// add and updating item using set
// for example:
// var arrayListInt=ArrayList<Int>()
//    arrayListInt.add(2)
//    arrayListInt.add(5)
//    arrayListInt.add(6)
//    arrayListInt.add(7)
//  Hash map  that have not duplicate in key for example    var map=HashMap<Int,String>()
//    map[1] = "wafaa"
//    map[2] = "safaa"
//    map[3] = "rafaa"
//    map[4] = "qafaa"
//    map[1]="REEEM" // FOR update key 1
// can use  hashmap of for example
// var myHashMap= hashMapOf<Any,Any>(1 to 10, 20 to 30 )
//    println(myHashMap[10])

// using other way to define array without estimate size like :
// var myArray= arrayOf(3,3,3) this can update item
//    var myArray1= listOf(3,3,3) this can't update item to make list mutable and can update item
// write as  var myArray1= mutableListOf(1,2,3)
// filter in list for example to get all item in list that start with p and
// and it refers to each item as the filter loops   using this code
//val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
// println( decorations.filter { it[0] =='p'})
// when use sequence in filter  When you return the filter results as a Sequence,
// the filtered variable won't hold a new list—it'll hold a Sequence as
//val filtered = decorations.asSequence().filter { it[0] == 'p' }
//// force evaluation of the lazy list
//val newList = filtered.toList()
//println("new list: $newList")

// you can use sequence with  as map val lazyMap = decorations.asSequence().map {
//        println("access: $it")
//        it
//    }

// variable scope Global "outside of function :public " and local mean : " inside function private"
//The nextInt() function takes an integer limit,
// which limits the number from Random() to 0 through 6 to match the week array.
// for example
//fun randomDay() : String {
//    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
//            "Friday", "Saturday", "Sunday")
//    return week[Random().nextInt(week.size)]
//}
//The Random() and nextInt() functions are defined in java.util.*
//Make compact functions Compact functions, or single-expression functions,
// put the body of the function after an = symbol, omit the curly braces {}, and omit the return. like
// fun isTooHot(temperature: Int) = temperature > 30

// lambdas and higher-order functions
//A lambda is an expression that makes a function and  lambdas are called anonymous functions
// But instead of declaring a named function, you declare a function that has no name
// for example var dirtyLevel = 20
//val waterFilter = { dirty : Int -> dirty / 2}
//println(waterFilter(dirtyLevel))
//  Create a higher-order function
//     fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
//        return operation(dirty)
//    }
////    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
//
////    println(updateDirty(30, waterFilter))
//
//    fun increaseDirty( start: Int ) = start + 1
//
//    println(updateDirty(16, ::increaseDirty)) //to specify the argument as a regular function, use the ::

// pairs, collections, and extension functions.
// How to work with pairs and triples
//More about collections
//Defining and using constants
// ant. In Kotlin, you can make top-level constants and
// assign them a value at compile time using const val. // const val rocks = 3
//The value is assigned, and can't be changed, which sounds a lot like declaring a regular val.
// So what's the difference between const val and val? The value for const val
// is determined at compile time, where as the value for val is determined during program
//
// val value1 = complexFunctionCall() // OK
//const val CONSTANT1 = complexFunctionCall() // NOT ok execution, which means, val can be assigned by a function at run time.
// In addition, const val only works at the top level, and in singleton classes declared with object
//object Constants {
//    const val CONSTANT2 = "object constant"
//}

//val foo = Constants.CONSTANT2
//Writing extension functions


// Step 2: Create a companion object
//Kotlin does not have a concept of class level constants.
//
//To define constants inside a class, you have to wrap them into companion objects
// declared with the companion

// class MyClass {
//    companion object {
//        const val CONSTANT3 = "constant in companion"
//    }
//}


// Write extensions
//Extension functions allow you to add
// functions to an existing class without having to access its source code

// fun String.hasSpaces(): Boolean {
//    val found = this.find { it == ' ' }
//    return found != null
//}
//println("Does it have spaces?".hasSpaces())
//  fun String.hasSpaces() = find { it == ' ' } != null
//Note: Extension functions are resolved statically, at compile time, based on the type of the variable.



//Just like mutableListOf, you can also make a mutableMapOf. A mutable map lets you put and remove items. Mutable just means able to change, immutable means unable to change.
    fun main() {
    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }
//    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

//    println(updateDirty(30, waterFilter))

    fun increaseDirty( start: Int ) = start + 1

    println(updateDirty(16, ::increaseDirty)) //to specify the argument as a regular function, use the ::



}