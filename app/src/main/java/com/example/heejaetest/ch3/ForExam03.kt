package com.example.heejaetest.ch3

fun main(){

    for(i in 1..10 step 2){
        print(i)
    }
    println()
    for(i in 2..10 step 2){
        print(i)
    }
    println()
    var sum:Int = 0
    for(i in 1..10 step 2){
        sum += i
    }
    print(sum)
println()
    sum = 0
    for(i in 2..10 step 2){
        sum += i
    }
    print(sum)
    println()

    for(i in 9 downTo 1){
        print(i)
    }
    println()

}