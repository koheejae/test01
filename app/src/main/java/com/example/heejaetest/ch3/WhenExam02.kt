package com.example.heejaetest.ch3

import java.lang.Integer.parseInt

fun main(){
    var x = 4
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // 블록 구문 사용 가능
            print("x는 1, 2가 아닙니다.")
        }
    }

    when(x){
        0, 1 -> print("x == 0 or x == 1")
        else -> print("기타")
    }
    var value :String= "22"
    var num = value.toInt()
try {

    when (num) {
       22 -> print("일치함")
        else -> print("기타")
    }
}catch (e: java.lang.NumberFormatException){
    println("Not number: $value")
}
    when (x) {
        in 1..10 -> print("x는 1 이상 10 이하입니다.")
        !in 10..20 -> print("x는 10 이상 20 이하의 범위에 포함되지 않습니다.")
        else -> print("x는 어떤 범위에도 없습니다.")
    }
    val str = "안녕하세요."
    val result = when(str) {
        is String -> "문자열입니다."
        else -> false
    }

}