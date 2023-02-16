package com.example.heejaetest.ch3

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble() // !! = throws Exception과 유사, ?는 NULL이라면 NULL 값을 반환, !!는 NULL값 비허용
    var grade: Char = 'F'
    if (score >= 90.0) {
        grade = 'A'
    } else if (score >= 80.0 && score <= 89.9) {
        grade = 'B'
    } else if (score >=70.0 && score <= 79.9) {
        grade = 'C'
    }
    /*
    if (score >= 90) {
    grade = 'A'
    } else if (score in 80.0..89.9) {
    grade = 'B'
    } else if (score in 70.0..79.9) {
    grade = 'C'
    }
     */
    println("Score: $score, Grade: $grade")
}