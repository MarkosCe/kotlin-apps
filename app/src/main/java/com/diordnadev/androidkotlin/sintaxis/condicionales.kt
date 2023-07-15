package com.diordnadev.androidkotlin.sintaxis

fun main(){

    ifBasico()
    ifAnidado("gatoperro")
}

fun ifBasico(name:String = "default"){
    if (name == "MARKOS"){
        println(name)
    }else{
        println("No es el nombre correcto")
    }
}

fun ifAnidado(animal:String){
    if (animal == "perro"){
        println("PERRO")
    }else if (animal == "gato"){
        println("GATO")
    }else{
        println("es otro animal")
    }
}

fun ifBoolean(happy:Boolean){
    if (happy){
        println("Felizx")
    }else{
        println("triste")
    }
}