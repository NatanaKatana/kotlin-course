package ru.stimmax.lessons.lesson09

//Коллекции
//Массив - списки -

fun main() {

    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)

    val emptyArray = Array(5) { "" }

    val emptyNullableArray = arrayOfNulls<Int>(5)

    val readOnlyList: List<String> = listOf("a", "b", "c")

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")

    numbers[0] = 10

    mutableList.add("d")
    mutableList.removeAt(0)
    mutableList.remove("c")
    mutableList.add(1, "c")
    mutableList[0] = "e"
    println(mutableList[2])

    val numberSet: Set<Int> = setOf(1, 2, 3, 4, 5)
    val mutableNumberSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

    val emptySet: Set<Int> = emptySet()
    val emptyMutableSet: MutableSet<Int> = mutableSetOf()

    mutableNumberSet.add(6) // добавляет элемент
    mutableNumberSet.remove(1) // удаляет элемент


    val set = setOf("K", "o", "t")




}