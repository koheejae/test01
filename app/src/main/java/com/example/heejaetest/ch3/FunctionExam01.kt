package com.example.heejaetest.ch3

fun main(){
    fun add(name: String, email: String){
        // name과 email을 회원 목록에 저장
    }

    add("박현규", "default")
    add("박용규", "default")
    add("함진아", "default")

    fun add2(name: String, email: String = "default"){
        // name과 email을 회원 목록에 저장
// email의 기본값은 "default". 즉, email로 넘어오는 값이 없으면 자동으로 "default" 입력
    }

    add2("Youngdeok")


}