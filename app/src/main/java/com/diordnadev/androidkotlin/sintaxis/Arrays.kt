package com.diordnadev.androidkotlin.sintaxis

fun main(){
    val weekDays = arrayOf("lunes","martes", "miercoles", "jueves", "viernes")

    println(weekDays.size)
    println(weekDays[4])

    //modificando valores
    weekDays[0] = "senul"
    println(weekDays[0])

    //bucles en arrays
    for (position in weekDays.indices){
        println(weekDays[position])
    }

    for ((position, value) in weekDays.withIndex()){
        println("$position , $value")
    }

    for (day in weekDays){
        println(day)
    }

}