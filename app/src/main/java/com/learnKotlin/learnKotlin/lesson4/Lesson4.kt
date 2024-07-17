package com.learnKotlin.learnKotlin.lesson4

class Lesson4 {
// Object-oriented programming
//    classes : Create a class
//    Kotlin automatically creates getters and setters for the properties you defined in the class
//    for example this class
//class Aquarium{
//    var width: Int = 20
//    var height: Int = 40
//    var length: Int = 100
//    fun printSize() {
//        println("Width: $width cm " +
//                "Length: $length cm " +
//                "Height: $height cm ")
//    }
//
//}
//Note: If you declared these properties with val instead of var, the properties would be immutable
//    create an instance of Aquarium :   val myAquarium = Aquarium()
//    Add class constructors
// to define constructor for class Aquarium without default value(var width: Int, var height: Int, var length: Int) {
// to define constructor for class Aquarium with default value class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
//...
//}
//   Add init blocks : if your constructor needs more initialization code,
//   it can be placed in one or more init blocks.
//class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {
//    init {
//        println("aquarium initializing")
//    }
//    init {
//        // 1 liter = 1000 cm^3
//        println("Volume: ${width * length * height / 1000} l")
//    }
//}
    // can have one or more init blocks
//    Kotlin class can also have one or more secondary constructors to allow constructor overloading,
//    that is, constructors with different arguments.
//    Note: Every secondary constructor must call the primary constructor first,
//    set and get      var volume: Int
//        get() = width * height * length / 1000
//        set(value) {
//            height = (value * 1000) / (width * length)
//        }

//    Learn about visibility modifiers
//    There have been no visibility modifiers, such as public or private,
//    in the code so far. That's because by default, everything in Kotlin is public,
//    public means visible outside the class
//    internal means it will only be visible within that module.
//    private means it will only be visible in that class
//  protected is the same as private, but it will also be visible to any subclasses.

//}
//    Learn about subclasses and inheritance
//    You must mark a class as open to allow it to be subclassed Similarly, you must mark properties and member variables as open, in order to override them in the subclass.

//    Neither an abstract class nor an interface can be instantiated on its own, which means you cannot create objects of those types directly.
//    Abstract classes have constructors.
//    Interfaces can't have any constructor logic or store any state.
//    Note: Abstract classes are always open; you don't need to mark them with open.
    //    Properties and methods of an abstract class are non-abstract unless you explicitly mark
    //    them with the abstract keyword.  If properties or methods are abstract, the subclasses must
    //    implement them.
    // Use interface delegation
    //  Create a data class
//    A data class is similar to a struct in some other languages—
//singletons, enums, and sealed classes
//    Kotlin also supports enums, which allow you to enumerate something and refer to it by name, much like in other language
//    A sealed class is a class that can be subclassed, but only inside the file in which it's declared.
    //    If you try to subclass the class in a different file, you get an error.
sealed class Seal
    class SeaLion : Seal()
    class Walrus : Seal()

    fun matchSeal(seal: Seal): String {
        return when(seal) {
            is Walrus -> "walrus"
            is SeaLion -> "sea lion"
        }
    }

    // summary for classes
   /* Classes and constructors
    Define a class in Kotlin using class.
    Kotlin automatically creates setters and getters for properties.
    Define the primary constructor directly in the class definition. For example: class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40)
    If a primary constructor needs additional code, write it in one or more init blocks.
    A class can define one or more secondary constructors using constructor, but Kotlin style is to use a factory function instead.
    All classes and functions in Kotlin are public by default, but you can use modifiers to change the visibility to internal,
     private, or protected.
     To make a subclass, the parent class must be marked open.
To override methods and properties in a subclass, the methods and properties must be marked open in the parent class.
A sealed class can be subclassed only in the same file where it is defined. Make a sealed class by prefixing the declaration with sealed.
*/
    fun main() {
        var myAquarium = Aquarium(10, 20, 30)
        myAquarium.printSize()
        myAquarium = Aquarium(30, 40, 50)
        myAquarium.printSize()
        val aquarium6 = Aquarium(numberOfFish = 29)
        aquarium6.printSize()
        println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} l")


    }

    class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
        init {
            println("aquarium initializing")
        }

        constructor(numberOfFish: Int) : this() {
            // 2,000 cm^3 per fish + extra room so water doesn't spill
            val tank = numberOfFish * 2000 * 1.1
        }

        var volume: Int
            get() = width * height * length / 1000
            set(value) {
                height = (value * 1000) / (width * length)
            }


        init {
            // 1 liter = 1000 cm^3
            println("Volume: ${width * length * height / 1000} l")
        }

        fun printSize() {
            println(
                "Width: $width cm " +
                        "Length: $length cm " +
                        "Height: $height cm "
            )
        }


    }
}

open class Aquarium2 (open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    open val shape = "rectangle"
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open var water: Double = 0.0
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        // 1 l = 1000 cm^3
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
    }
}

class TowerTank (override var height: Int, var diameter: Int): Aquarium2(height = height, width = diameter, length = diameter) {
}
