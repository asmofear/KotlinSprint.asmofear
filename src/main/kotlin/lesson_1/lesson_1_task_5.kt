package org.example.lesson_1

//Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//- Переведи в коде количество секунд в целые минуты и целые часы,
//сохраняя остаток секунд и минут в новые переменные;
//- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды],
//например так: 01:30:09;
//- Значения часов, минут и секунд отображать двумя цифрами.

fun main () {

    val secondsInSpace: Int = 6480

//    Выведение остатка
    val remainder = secondsInSpace % theAxiomValue
        println("Остаток от деления $secondsInSpace секунд на $theAxiomValue равен $remainder")
        val remainderVariable = remainder
        println("Остаток секунд - $remainder")

    val minutesInSpace = secondsInSpace / theAxiomValue

//    Выведение остатка
    val remainder2 = minutesInSpace % theAxiomValue
        println("Остаток от деления $minutesInSpace минут на $theAxiomValue равен $remainder2")
        val remainderVariable2 = remainder2
        println("Остаток минут - $remainder2")

    val hoursInSpace = (minutesInSpace / theAxiomValue)

    println("$minutesInSpace минут в космосе")
    println("$hoursInSpace часов в космосе")

}

const val theAxiomValue = 60