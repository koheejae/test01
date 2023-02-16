package com.example.heejaetest.ch3

fun print3Numbers(num1:Int, num2: Int, num3: Int){

}
fun print4Numbers(num1:Int, num2:Int, num3:Int, num4: Int){

}

fun main(args: Array<String>){
    normalVarargs(1,2,3,4)
    normalVarargs(4,5,6)
}

fun normalVarargs(vararg counts: Int){
    for(num in counts){
        println("$num")
    }
    print("\n")
}