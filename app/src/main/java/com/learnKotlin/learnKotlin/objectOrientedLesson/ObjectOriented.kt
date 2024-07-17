package com.learnKotlin.learnKotlin.objectOrientedLesson

//Classes
//the class body surrounded by curly braces {}. Both the header and the body are optional;
//if the class has no body, the curly braces can be omitted class Empty.
//Constructor
//A class in Kotlin has a primary constructor and possibly one or more secondary constructors.
//The primary constructor is declared in the class header,
// and it goes after the class name and optional type parameters.
//class Person constructor(firstName: String) { /*...*/ }
// if the primary constructor does not have any annotations or visibility modifiers,
// the constructor keyword can be omitted:
//class Person(firstName: String) { /*...*/ }

//If the constructor has annotations or visibility modifiers,
// the constructor keyword is required and the modifiers go before it:
//class Customer public @Inject constructor(name: String) { /*...*/ }
//Secondary constructor
//A class can also declare secondary constructors, which are prefixed with constructor:
class Person(val pets: MutableList<Pet> = mutableListOf())

class Pet {
    constructor(owner: Person) {

        owner.pets.add(this) // adds this pet to the list of its owner's pets
    }
}


//If you want to run some code during object creation, use initializer blocks inside the class body
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

//creating instances of class
//To create an instance of a class, call the constructor as if it were a regular function.
// You can assign the created instance to a variable: val invoice = Invoice()
//
//val customer = Customer("Joe Smith")
//Kotlin does not have a new keyword.
//Classes can contain:
//
//Constructors and initializer blocks
//
//Functions
//
//Properties
//
//Nested and inner classes
//
//Object declarations
//Abstract classes
//A class may be declared abstract, along with some or all of its members.
//An abstract member does not have an implementation in its class
//. You don't need to annotate abstract classes or functions with open.

//abstract class Polygon {
//    abstract fun draw()
//}
//
//class Rectangle : Polygon() {
//    override fun draw() {
//        // draw the rectangle
//    }
//}
//You can override a non-abstract open member with an abstract one.

open class Polygon {
    open fun draw() {
        // some default polygon drawing method
    }
}

abstract class WildShape : Polygon() {
    // Classes that inherit WildShape need to provide their own
    // draw method instead of using the default on Polygon
    abstract override fun draw()
}
//Companion objects
//If you need to write a function that can be called without having a class instance
//but that needs access to the internals of a class, you can write it as a member of an object declaration inside that class.

// inheritance
//All classes in Kotlin have a common superclass, Any, which is the default
// superclass for a class with no supertypes declared:
class Example // Implicitly inherits from Any
//Any has three methods: equals(), hashCode(), and toString().
//By default, Kotlin classes are final – they can't be inherited.
// To make a class inheritable, mark it with the open keyword:
open class Base(p: Int)
class Derived(p: Int) : Base(p)

open class Shape {
    open fun draw() { /*...*/ }
    fun fill() { /*...*/ }
}

class Circle() : Shape() {
    override fun draw() { /*...*/ }
}

// Generics: in, out, where

fun main() {
  

}