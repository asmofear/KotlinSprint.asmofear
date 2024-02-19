package org.example.lesson_2

//Напиши программу-калькулятор для банковского приложения (такой функционал бывает на промо экранах).
//Используя формулу сложных процентов (ее можно загуглить),
//нужно посчитать размер вклада через 20 лет с такими условиями:
//
//– Клиент ввел в приложении сумму 70_000 рублей
//(считать ее известной заранее и проинициализировать переменную);
//– Процентная ставка 16,7% (проценты начисляются в конце года);
//– Подсчитать размер вклада через 20 лет;
//– Результат должен быть дробным числом с 3 знаками после запятой;
//– Ответ должен получиться таким 1536438.428.

fun main() {

    val clientDeposit = 70000
    val totalTimeDeposit: Float = 20.0f
    val percentDeposit: Float = 16.7f

    val percentInYear: Float = percentDeposit / percentTotal
    val compoundInterest = clientDeposit * ( 1 + percentInYear) * totalTimeDeposit

    println("Через 20 лет у вас будет $compoundInterest рублей")
}

const val percentTotal = 100.0f