package com.example.heejaetest.ch3

fun main(){
    println("월급을 입력하세요 : ")
    var price = readLine()!!.toInt()
    var grade:String = "인턴"

    when {
        price >= 600 -> grade = "부장"
        price in 500..599 -> grade = "차장"
        price in 400..499 -> grade = "과장"
        price in 300..399 -> grade = "대리"
        price in 200..299 -> grade = "사원"
        else -> grade = "인턴"
    }
    println("안녕하세요 ${grade}님")
}