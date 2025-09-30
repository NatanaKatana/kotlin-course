package ru.stimmax.lessons.lesson04


//Базовые типы данных


val muInt: Int = 5
val myInt: UInt = 5U
val myFloat: Float = 0.58F
val myLong: Long = 1_234_456_890L
//val myShort: Short = 32000
val muByte: Byte = 120
val myDouble: Double = 5.99
val isKotlinFun: Boolean = true
val text: String = "Hello, Kotlin!"
val letter: Char = 'A'

// Коллекции
val number: Array<Int> = arrayOf(1, 2, 3)
val string: List<String> = listOf("one", "two", "one")
val doubles: Set<Double> = setOf(23.3, 56.8)

// Словари
// Словарь - map
// Тип ключа и тип значения.

val KeysToValues: Map<Int, String> = mapOf(
    1 to "Значение 1",
    2 to "Значение 2",
)

//Чтобы вписать null нужно поставить ? Short? = null
val myShort: Short? = null

fun main() {
    val r: Float = muInt + myFloat
}


fun example(): Nothing {
    throw RuntimeException("")
}


var something: Any = "24"


