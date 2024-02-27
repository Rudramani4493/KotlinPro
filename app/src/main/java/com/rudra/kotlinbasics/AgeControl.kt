package com.rudra.kotlinbasics

import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock

fun main() {
    print("Enter your age as a whole number")
    val age = readln().toInt()
    if(age > 18 && age < 40) {
        println("You acn enter the club")
    } else if (age >= 40) {
        println("You cannot go into the Club, please go home")
    } else{
        println("Age not verified. Please contact support")
    }

}