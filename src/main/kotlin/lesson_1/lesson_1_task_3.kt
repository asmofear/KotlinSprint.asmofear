package org.example.lesson_1

//В любом учебнике есть задачи про космос. Объяви переменные и выведи данные о полете в космос первого человека.
//
// – Запиши в новую переменную year год полета Юрия Гагарина в космос;
// – Объяви и проинициализируй переменные hour и minute – час и минуту взлета соответственно;
// – Выведи год, час и минуту взлета по одной переменной на каждую строку;
// – Затем измени значения переменных hour и minute, чтобы они теперь имели значение часа и минуты посадки;
// – Выведи время посадки в одной строке в формате [часы:минуты]. Пример: 10:55.
//
//Определи, где в программе переменные должны задаваться через val, а где через var.
//
//Данные для задачи:
//Год полета – 1961
//Взлет – 09:07
//Посадка – 10:55
//
//Подсказка для вывода: какой метод печати в консоль не делает перенос в конце строки?

    fun main() {

        val yearOfFlight = 1961

        var hourOftakeoff: String = "09"

        var minuteOftakeoff: String = "07"

        println("Год и время взлета:\n$yearOfFlight\n$hourOftakeoff\n$minuteOftakeoff")

        var hourOfBoarding: String = "10"

        var minuteOfBoarding: String = "55"

        println("Время посадки - $hourOfBoarding:$minuteOfBoarding")

    }