package com.diordnadev.androidkotlin.sintaxis

fun main(){

    //inmutableList()
    mutableList()

}

fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("lunes","martes", "miercoles", "jueves", "viernes")
    println(weekDays)

    //anadir al final de la lista
    weekDays.add("markosDay")

    //anadir en un indice
    weekDays.add(0, "newDay")
    println(weekDays)

    //si no esta vacio impirmir ls dias
    if (weekDays.isNotEmpty()){
        weekDays.forEach { day -> println(day) }
        //es lo mismo que el for de arriba, solo que aqui se usa el it que trae por defecto
        //weekDays.forEach{ println(it) }
    }
}

fun inmutableList(){
    val readOnly:List<String> = listOf("lunes","martes", "miercoles", "jueves", "viernes")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //filtrar
    val example = readOnly.filter { it.contains("a") }
    println(example)

    //recorrer lista // iterar
    readOnly.forEach { day -> println(day) }

}
