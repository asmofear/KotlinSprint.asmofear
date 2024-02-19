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

    val permanentStaff = 50

    val permStaffSalary = 30000

    val internStaff = 30

    val internSalary = 20000

    val totalExpensesPerm = permanentStaff * permStaffSalary

    val totalExpensesIntern = internStaff * internSalary

    val allExpenses = totalExpensesPerm + totalExpensesIntern

    val totalStaff = permanentStaff + internStaff

    val averageByExpenses: Int = allExpenses / totalStaff

    println("""Расходы на постоянных сотрудников = $totalExpensesPerm руб.
        |Общие расходы по ЗП после прихода стажеров = $allExpenses руб.
        |Средняя ЗП = $averageByExpenses руб.
    """.trimMargin())

}