package com.example.heejaetest.ch3

fun main(){
    var data = arrayOf(10,20,30)
    for((index, value) in data.withIndex()){
        print(value)
        if(index !== data.size - 1) print(",")
    }
}