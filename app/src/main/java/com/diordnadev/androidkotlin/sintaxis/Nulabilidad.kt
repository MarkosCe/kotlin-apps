package com.diordnadev.androidkotlin.sintaxis

fun main(){
    // el signo ? indica que puede ser nulo
    var name:String? = "markos"
    val name2:String? = null

    // !! indica que es seguro que la variable no va a ser nulo
    println(name!![3])

    //aqui el signo indica si name no es nulo,entonces has lo que se indica
    //y el ?: indica si name es nulo
    println(name2?.get(3) ?: println("es nulo"))
}