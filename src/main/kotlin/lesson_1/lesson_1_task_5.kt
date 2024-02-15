package org.example.lesson_1

//Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//- Переведи в коде количество секунд в целые минуты и целые часы,
//сохраняя остаток секунд и минут в новые переменные;
//- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды],
//например так: 01:30:09;
//- Значения часов, минут и секунд отображать двумя цифрами.

fun main() {
    val totalSecondsInSpace = 6480

    val hours = totalSecondsInSpace / totalSecondsInHour

    val remainingSecondsAfterHours = totalSecondsInSpace % totalSecondsInHour

    val minutes = remainingSecondsAfterHours / 60

    val seconds = remainingSecondsAfterHours % 60

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println("Гагарин провел в космосе: $formattedTime")

}

const val totalSecondsInHour = 3600