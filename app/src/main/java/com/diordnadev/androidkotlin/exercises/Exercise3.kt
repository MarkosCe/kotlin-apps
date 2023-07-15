package com.diordnadev.androidkotlin.exercises

fun main() {
    printFinalTemperature(27.0, "Celsius", "Fahrenheit", conversionCelsiusToFahrenheit)
}

val conversionCelsiusToFahrenheit: (Double) -> Double = { value ->
    value * 9/5 + 32.0
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}