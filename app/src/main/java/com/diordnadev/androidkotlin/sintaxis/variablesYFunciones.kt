package com.diordnadev.androidkotlin.sintaxis

/**
 * Valores y variables en kotlin
 */

fun main(){
    showMyName("Marcos")
    add(345,324)
    showMyName()
    val number = subtract(532,13)
}

//valor por defecto si no hay algun valor
fun showMyName(name:String = "ka"){
    println("me llamo $name")
}

fun add(firstNumber:Int, secondNumber:Int){
    println(firstNumber + secondNumber)
}

fun subtract(number1:Int, number2:Int):Int{
    return number1 - number2
}

//funcion de una sola linea
fun substractCool(number1:Int, number2:Int) = number1 - number2

fun variablesNumericas(){
    /**
     * creando un valor: se usa val(el val es constante
     * no puede ser cambiado)
     */

    /**
     * para crear una variable: se usa var(este variable
     * si se puede cambiar)
     */

    /**
     *variables numericas
     */
    //int --> -2,147,483,647 a 2,147,483,647
    val age:Int = 30
    var age2:Int = 30
    println(age2)
    age2 = 23
    println(age2)

    //long --> -9,223,372,836,854,775,807 a 9,223,372,836,854,775,807
    val example:Long = 30

    //float
    val floatExample:Float = 40.845F

    //double
    val doubleExample:Double = 324.4324

    println(age + age2)
}

fun variablesAlfanumericas(){
    /**
     *variables Alfanumericas
     */
    //Char
    val charExample1:Char = 'a'
    val charExample2:Char = '2'
    val charExample3:Char = 'g'

    //String
    val stringExample:String = "esto es un STRING"
    val stringExample2 = "esto es un STRING"

    //--------------------

    print(stringExample)
}

fun variablesBoolean(){
    /**
     * Variables Booleanas
     */
    //boolean
    val booleanExample1:Boolean = true
    val booleanExample2:Boolean = false
    val booleanExample3 = false
}

