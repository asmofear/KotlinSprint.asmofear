package org.example.lesson_1

//Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//- Переведи в коде количество секунд в целые минуты и целые часы,
//сохраняя остаток секунд и минут в новые переменные;
//- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды],
//например так: 01:30:09;
//- Значения часов, минут и секунд отображать двумя цифрами.

fun main () {

    val secondsInSpace: Double = 6480.0

    val secondsInMinute = 60

    val minutesInHour = 60

//    Выведение остатка
    val remainder = secondsInSpace % secondsInMinute
        println("Остаток от деления $secondsInSpace секунд на $secondsInMinute равен $remainder")
        val remainderVariable = remainder
        println("Остаток секунд - $remainder")

    val minutesInSpace = secondsInSpace / secondsInMinute

//    Выведение остатка
    val remainder2 = minutesInSpace % minutesInHour
        println("Остаток от деления $minutesInSpace минут на $minutesInHour равен $remainder2")
        val remainderVariable2 = remainder2
        println("Остаток минут - $remainder2")

    val hoursInSpace = (minutesInSpace / minutesInHour)

    println("$minutesInSpace минут в космосе")
    println("$hoursInSpace часов в космосе")



}