package ru.stimmax.lessons.lesson11

fun main() {
    println(a6(5, 6))
}


//Практические задания
//Задания на написание сигнатур функций

//Определите функцию doSomething, которая не принимает аргументов и не возвращает значения.
fun a1() {

}

//Определите функцию getUserName, которая не принимает аргументов и возвращает строку (String).
fun a2(): String {
    return "jfdl"
}

//Определите функцию printGreeting, которая принимает строковый аргумент greeting и не возвращает значения.
fun a3(a: String) {

}

//Определите функцию calculateArea, которая принимает два аргумента типа Double и возвращает значение типа Double.
fun a4(a: Double, b: Double): Double {
    return a
}

//Определите функцию findMax, которая принимает два целых числа и возвращает целое число (Int).


//Определите функцию isNullOrEmpty, которая принимает строку (String?) и возвращает логическое значение (Boolean).
fun a5(a: String?): Boolean {
    return true
}

//Определите функцию logError, которая принимает строковый аргумент message и не возвращает значения.


//Определите функцию getFullName, которая принимает два строковых аргумента (firstName и lastName) и возвращает строку (String).


//Определите функцию calculateDiscount, которая принимает аргумент price типа Double и возвращает значение типа Double.


//Определите функцию isValid, которая принимает аргумент input типа String? и возвращает логическое значение (Boolean).


//Задание на возврат значения

//Напишите функцию greet, которая принимает строковый параметр name и возвращает приветственное сообщение в виде строки.

//Напишите функцию calculateSum, которая принимает два целых числа в качестве параметров и возвращает их сумму с использованием оператора return.
fun a6(a: Int, b: Int): Int {
    return a + b
}

//Создайте функцию getMax, которая принимает два числа и возвращает большее из них, используя return.
fun a7(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else b
}

//Напишите функцию calculateTotalCost, которая принимает словарь товаров и их цены, а затем возвращает итоговую стоимость.

//Задание на прерывание функции

//Реализуйте функцию printPositiveNumbers, которая принимает список чисел и выводит только положительные числа. Если встречается отрицательное число, функция должна прекратить выполнение с помощью return без возврата значения.
fun a8(a: List<Int>) {
    for (numbers in a) {
        if (numbers > 0) {
            println("$numbers")
        } else if (numbers == 0) {
            println("This is zero")
        } else return
    }
}

//Напишите функцию replaceString, которая принимает список строк и искомую строку.
// Функция должна перебрать список и заменить первое вхождение искомой строки на её
// версию в верхнем регистре, после чего завершить выполнение с помощью return без возврата значения.
fun a9(a: MutableList<String>, b: String) {
    for (i in a.indices) {
        if (a[i].contains(b)) {
            a[i] = a[i].replaceFirst(b, b.uppercase())
            return
        }
    }
}


//Создайте функцию findFirstEvenNumber, которая принимает список целых чисел.
// Функция должна выводить каждый номер. При нахождении первого чётного числа она должна
// вывести сообщение "Чётное число найдено" и завершить выполнение с помощью return
// без возврата значения.

fun a10(a: List<Int>) {
    for (number in a) {
        println(number)
        if (number % 2 == 0) {
            println("Четное число найдено ")
            return
        }
    }
}


//

fun a11(a: Map<String, Double>): Double {
    var summ = 0.0

    for ((key, value) in a) {
        summ += value
    }
    return summ
}

fun a12(a: Map<String, Double>): Double {
    var summ = 0.0

    for ((key, value) in a) {
        if (value < 0) {
            summ -= value
        } else
            summ += value
    }
    return summ
}

fun a13(a: Map<String, Double>): Double {
    var summ = 0.0

    for ((key, value) in a) {
        summ += if (value < 0) {
            0 - value
        } else {
            value
        }
    }
    return summ
}