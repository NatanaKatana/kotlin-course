package ru.stimmax.lessons.lesson11

//Функции

//Синтаксис функции:
//
//fun имяФункции(параметры): ТипВозвращаемогоЗначения {
//    // Тело функции
//    return значение
//}

fun main() {
    sayHello()
    greetUser("Pupa")
    val r = sum(2, 5)
    println(r)
    println(sum(2, 5))
    printSum(5,6)
    multiply(5,9)
    calculateDiscount(56.56)
}

fun sayHello() {
    println("Hello, world!")
}

fun greetUser(name: String) {
    println("Hello, $name!")
}


//Возвращаемые значения
//
//Функция в Kotlin может возвращать значение. Для указания типа возвращаемого значения используется двоеточие : после круглых скобок с параметрами.
fun sum(a: Int, b: Int): Int {
    return a + b
}


//Если функция ничего не возвращает, то тип возвращаемого значения — Unit. Обычно его можно опустить, как в примерах выше
fun printSum(a: Int, b: Int) : Unit {
    println("Sum of $a and $b is ${a + b}")
}

//Однострочные функции
fun multiply(a: Int, b: Int): Int = a * b

//Модификаторы доступа: public и private
//Функции в Kotlin могут иметь модификаторы доступа. В этом уроке мы разберём только два — public и private.
//public — функция доступна отовсюду. По умолчанию, все функции являются публичными, если явно не указано другое.
//private — функция доступна только внутри того файла или класса, в котором она определена.
private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}
fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}


//Ключевое слово return
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}


// Пример функции с использованием return для немедленного завершения:
fun findValue(numbers: List<Int>, target: Int) : String {              // сигнатура функции
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return "oskd"
        }
    }
    println("Value not found")
    return "oskd"
}