package com.diordnadev.androidkotlin.sintaxis

fun main() {

    getMonth(10)
    getSemester(11)
    result(true)
}

fun result(value: Any) {
    when (value) {
        is Int -> value + value
        is String -> println("STRING")
        is Boolean -> if (value) println("holiwi")
    }
}

fun getSemester(month: Int): String {
    val result = when (month) {
        in 1..6 -> "Primer semestre"
        in 7..12 -> "Segundo semestre"
        !in 1..12 -> "semestre no valido"
        else -> "nada"
    }
    return result
}

fun getSemester2(month: Int): String {
    return when (month) {
        in 1..6 -> "Primer semestre"
        in 7..12 -> "Segundo semestre"
        !in 1..12 -> "semestre no valido"
        else -> "nada"
    }
}

fun getSemester3(month: Int) = when (month) {
    in 1..6 -> "Primer semestre"
    in 7..12 -> "Segundo semestre"
    !in 1..12 -> "semestre no valido"
    else -> "nada"
}


fun getTrimester(month: Int) {
    when (month) {
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("segundo trimestre")
        7, 8, 9 -> println("tercer trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("Trimestre no valido")
    }
}

fun getMonth(month: Int) {
    when (month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> {
            println("Octubre")
            println("birthday")
        }

        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("No es un mes valido")
    }
}