package org.example

fun main() {
    task_1()
    task_2()
}

fun task_1() {
    val countOrders: Int = 75
    val thankShopping: String = "Спасибо за покупку!!!"
    println(countOrders)
    println(thankShopping)
}

fun task_2() {
    var countWorkers: Int = 2000
//    println(countWorkers)
    countWorkers -=  1
    println(countWorkers)
}