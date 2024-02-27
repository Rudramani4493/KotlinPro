package com.rudra.kotlinbasics

// floating point, boolean, char, unicode, backslash, string, if else statements
// almost everything in kotlin is treated as objects


fun main() {
    // float
    val circleRatio = 3.14f
    println(circleRatio)
    // bool
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse) //or
    // true
    println(myTrue && myFalse) // conjunction , logical and
    // false
    println(!myTrue)
    // false
    println(boolNull)
    // null


    // second
    val myBoolT: Boolean = true
    val myboolF: Boolean = false
    println(myBoolT || myboolF) //true
    println(myBoolT && myboolF) // false
    println(!myBoolT)  //false

    // unicode, characters
    val myChar = 'r' // one unicode character
    println(myChar) // prints r, 149,876 unicode characters
    val unival = '\u00AE' // copyright
    println(unival)
    val back ='\\'
    println(back)


    // strings

    val name = "Rudramani Dubey 4493"
    for (c in name) {
        println(c)
    }

    val capName = " RUDRAMANI DUBEY"
    println(capName.lowercase())
    println("Mr." + capName)
    println("Shubham" +"\n" + "D")// \n creates anew line


    // if else statements
    if(true) {
        // execute what's in here
    } else {
        // if not true execute ehat's in here
    }

    // (Readln and toInt)
    val enteredValue = readln()
    val x = enteredValue.toInt()


    if(x >= 18)
    {
        println("Allowed to enter")
    } else {
        println("Not Allowed to enter")
    }




}