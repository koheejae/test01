package com.example.heejaetest.ch3

fun main(){
    var data = arrayOf(10,20,30)
    for(i in data.indices){
        print(data[i])
        if(i !== data.size - 1) print(",")
    }
}