package org.example.lesson_2

//В мобильной стратегии есть бафф (временное усиление какого-либо юнита или процесса),
//который дает +20% к добытым материалам. Было добыто 7 кристаллической и 11 железной руды без баффа
//– заранее известные данные, объявить и проинициализировать.
//
//Напиши программу, которая будет учитывать действие баффа и выводить в консоль количество “бонусных”
//(то есть тех материалов, которые даются “сверху” баффом). По одной строке на материал с его названием.
//
//Если получается нецелое число, то дробная часть должна отбрасываться.

fun main() {

    val crystalOre = 7
    val ironOre = 11

    var buffedCrystalOre = (crystalOre * precentageBuff) / 100
    var buffedIronOre = (ironOre * precentageBuff) / 100

    println("Добыто кристалической руды: $crystalOre + $buffedCrystalOre бонусных")
    println("Добыто железной руды: $ironOre + $buffedIronOre бонусных")

}

const val precentageBuff = 20