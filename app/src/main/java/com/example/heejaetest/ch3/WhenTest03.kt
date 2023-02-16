package com.example.heejaetest.ch3

fun main(){
    print("직급을 입력하세요 : ")
    var grade = readLine()!!.toString()
    var price:Int = 200

    when(grade) {
        "부장" -> price = 600
        "차장" -> price = 500
        "과장" -> price = 400
        "대리" -> price = 300
        "사원" -> price = 200
        "인턴" -> price = 100
    }
    println("${grade}님의 월급은 ${price}입니다")
}