package ru.stimmax.lessons.lesson11.homeworks

//Задачи на сигнатуру метода

//Напишите сигнатуру метода в которую входит модификатор доступа, название функции,
//список аргументов с типами и возвращаемое значение. В теле метода можешь сделать
// возврат объекта нужного типа если это требуется для устранения ошибок.

//1. Не принимает аргументов и не возвращает значения.
fun a1() {
}

//2. Принимает два целых числа и возвращает их сумму.
fun a2(a: Int, b: Int): Int = a + b

//3. Принимает строку и ничего не возвращает.
fun a3(a: String) {
}

//4. Принимает список целых чисел и возвращает среднее значение типа Double.
fun a4(a: List<Int>): Double {
    return 25.25
}

//5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и
// доступна только в текущем файле.
private fun a5(a: String?): Int? {
    return a?.length
}

//6. Не принимает аргументов и возвращает nullable вещественное число.
fun a6(): Double? {
    return 5.0
}

//7. Принимает nullable список целых чисел, не возвращает значения и доступна только в
// текущем файле.
private fun a7(a: List<Int>?) {
}

//8. Принимает целое число и возвращает nullable строку.
fun a8(a: Int): String? {
    return "jvdkv"
}

//9. Не принимает аргументов и возвращает список nullable строк.
fun a9(): List<String?> {
    return emptyList<String?>()
}

//10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun a10(a: String?, b: Int?): Boolean? {
    return true
}

//Задачи на написание кода

// Напишите валидную сигнатуру метода, а так же рабочий код для задач.
fun main() {
    println(multiplyByTwo(5))
    println(isEven(5623))
    printNumbersUntil(11)
}

//11. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его,
// умноженное на 2.
fun multiplyByTwo(a: Int): Int = a * 2

//12. Создайте функцию isEven, которая принимает целое число и возвращает true, если число
// чётное, и false в противном случае.
fun isEven(a: Int): Boolean {
    if (a % 2 == 0) return true
    else return false
}

//13. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран
// числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью
// return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}

//14. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает
// первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(a: List<Int>): Int? {
    for (number in a) {
        if (number < 0) return number
    }
    return null
}

//15. Напишите функцию processList, которая принимает список строк. Функция должна проходить
// по списку и выводить каждую строку. Если встречается null значение, функция должна
// прекратить выполнение с помощью return без возврата значения.

fun processList(a: List<String?>) {
    for (value in a) {
        if (value == null) return
        println(value)
    }
}