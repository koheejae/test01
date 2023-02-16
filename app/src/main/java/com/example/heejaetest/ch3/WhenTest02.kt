package com.example.heejaetest.ch3

fun main(){
    println("성적을 입력하세요 : ")
    var score = readLine()!!.toDouble()
    var grade = 'F'
    when(score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        in 60.0..69.9 -> grade = 'D'
        in 50.0..59.9 -> grade = 'E'
        !in 50.0..100.0 -> grade = 'F'
    }
    println("성적: $score, 등급: $grade")
}