package org.example.lesson_2

//В компании работало 50 человек с зарплатой по 30000 рублей.
//Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому.
//Пишем часть гипотетического софта для бухгалтерии, который будет считать:
//
//– Расходы на выплату зарплаты постоянных сотрудников;
//– Общие расходы по ЗП после прихода стажеров;
//– Среднюю ЗП одного сотрудника после устройства стажеров.
//
//Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
//Все значения необходимо вывести в виде целых чисел.

fun main () {

    val permanentStaff: Int = 50

    val permStaffSalary: Int = 30000

    val internStaff: Int = 30

    val internSalary: Int = 20000
//
    val totalExpensesPerm: Int = (permanentStaff * permStaffSalary)

    val totalExpensesIntern: Int = (internStaff * internSalary)

    val allExpenses: Int = (totalExpensesPerm + totalExpensesIntern)

    val totalStaff: Int = (permanentStaff + internStaff)

    val averageByExpenses: Int = ((totalExpensesIntern + totalExpensesPerm)) / totalStaff

    println("""Расходы на постоянных сотрудников = $totalExpensesPerm руб.
        |Общие расходы по ЗП после прихода стажеров = $allExpenses руб.
        |Средняя ЗП = $averageByExpenses руб.
    """.trimMargin())

}