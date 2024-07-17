package com.learnKotlin.learnKotlin.lesson1

class Lesson1 {
//    fun is used to declare a function
//    the main() function is where your program starts from

    // difference between val and var
//    read-only variables with val
//    mutable variables with var
//    Variables can be declared outside the main() function at the beginning of your program.
//    Variables declared in this way are said to be declared at top level.
    //Kotlin's ability to infer the data type is called type inference.

//    Category             Basic types
//
//    Integers             Byte, Short, Int, Long
//
//    Unsigned integers    UByte, UShort, UInt, ULong
//
//    Floating-point numbers   Float, Double
//
//    Booleans      Boolean
//
//    Characters     Char
//
//    Strings        String
//

//    fun main() {
//        val a: Int = 1000
//        val b: String = "log message"
//        val c: Double = 3.14
//        val d: Long = 100_000_000_000
//        val e: Boolean = false
//        val f: Char = '\n'
//    }


//    In Kotlin, the underscore (_) is used as a digit separator to make large numbers more readable.
//    The underscores in 100_000_000_000 make it easier to see that the
//    value is one hundred billion (100000000000).
//    The underscores can be placed anywhere between digits to
//    improve clarity, similar to how commas or spaces

    //  difference between float and double
    //  difference between char and string
    // readLine command for example     var n:Double= readln().toDouble() , the readln return the default string
    // $ and ${}
    // kotlin datatype  string,double,float,char for one character ,boolean
    // addition,subtraction,multiplication, conversion type
    // creating function  and fun name is small
    // null safety ? to allow null


//    Kotlin has the following collections for grouping items:
//
//  Collection type     Description

//    Lists             Ordered collections of items،Lists store items in the order that they are added, and allow for duplicate items.

//    Sets              Unique unordered collections of items

//    Maps             Sets of key-value pairs where keys are unique and map to only one value
//
//
//    To create a read-only list (List), use the listOf() function.
//
//    To create a mutable list (MutableList), use the mutableListOf() function.

    val list1: List<String> = listOf("triangle", "square", "circle")
    val list2 = listOf("triangle", "square", "circle")
    val list4: MutableList<String> = mutableListOf("triangle", "square", "circle")
    val list3 = mutableListOf("triangle", "square", "circle")
    //To check that an item is in a list, use the in operator:
    //val readOnlyShapes = listOf("triangle", "square", "circle")
    //println("circle" in readOnlyShapes) result true

//    To add or remove items from a mutable list, use .add() and .remove() functions respectively:

//    Set
//    Whereas lists are ordered and allow duplicate items, sets are unordered and only store unique items.

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
// Add "pentagon" to the list
//    shapes.add("pentagon")
//    println(shapes)
// [triangle, square, circle, pentagon]

// Remove the first "pentagon" from the list
//    shapes.remove("pentagon")
//    println(shapes)
// [triangle, square, circle]

//    To create a read-only set (Set), use the setOf() function.
//
//    To create a mutable set (MutableSet), use the mutableSetOf() function

    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")

    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

//    println(readOnlyFruit)
// [apple, banana, cherry]


    //Map
    //Maps store items as key-value pairs. You access the value by referencing the key.

    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
//    println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    val juiceMenu: MutableMap<String, Int> =
        mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)

//    To add or remove items from a mutable map, use .put() and .remove() functions respectively:

//    juiceMenu.put("coconut", 150) // Add key "coconut" with value 150 to the map

//    println(juiceMenu)
// {apple=100, kiwi=190, orange=100, coconut=150}

//    juiceMenu.remove("orange")    // Remove key "orange" from the map
//    println(juiceMenu)
// {apple=100, kiwi=190, coconut=150}

//    To check that a key or value is in a map, use the in operator:
//val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
//    println("orange" in readOnlyJuiceMenu.keys)
// true
//    println(200 in readOnlyJuiceMenu.values)
// false

// fun getName(name: String?) {

    // }

    fun getData() {
        val fName = "wafaa"
        val lName = "Jame"
        val age = 50
        println("the name$fName")
        println("the last name$lName")
        println("the age$age")
    }

    private fun getAge(a: Int, b: Int) {
        val result = a + b
        println("the result $result")

    }

    fun main() {
        getData()
        getAge(b = 7, a = 6)
        getAge(8, 9)

        val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        println(readOnlyJuiceMenu.keys)
// [apple, kiwi, orange]
        println(readOnlyJuiceMenu.values)
// [100, 190, 100]

    }


}