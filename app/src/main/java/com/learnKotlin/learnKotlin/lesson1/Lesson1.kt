package com.learnKotlin.learnKotlin.lesson1

class Lesson1 {
    // difference between val and var
    //  difference between float and double
    //  difference between char and string
    // readLine command for example     var n:Double= readln().toDouble() , the readln return the default string
    // $ and ${}
    // kotlin datatype  string,double,float,char for one character ,boolean
    // addition,subtraction,multiplication, conversion type
    // creating function  and fun name is small
    // null safety ? to allow null

    fun getName(name:String?){

    }
    fun getData(){
        val fName="wafaa"
        val lName="Jame"
        val age=50
        println("the name$fName")
        println("the last name$lName")
        println("the age$age")
    }
    private fun getAge(a:Int, b:Int) {
        val result=a+b
        println("the result $result")

    }
    fun main(){
        getData()
        getAge(b = 7,a=6)
        getAge(8,9)



    }



}