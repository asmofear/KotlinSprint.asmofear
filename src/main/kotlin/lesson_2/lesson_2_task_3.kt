package org.example.lesson_2

//Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
//а время прибытия вычисляется из них. Сервер прислал данные,
//что поезд выехал в 9:39 и будет в пути 457 минут.
//
//– Создай целочисленные переменные и проинициализируй их этими данными;
//– Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
//– Выведи результат в консоль.

fun main () {

    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457

    val arrivalHour = (departureHour + (departureMinute + travelTime) / 60) % 24
    val arrivalMinute = (departureMinute + travelTime) % 60

    println("Поезд прибудет в $arrivalHour:${if (arrivalMinute < 10) "0" else ""}$arrivalMinute")

}
