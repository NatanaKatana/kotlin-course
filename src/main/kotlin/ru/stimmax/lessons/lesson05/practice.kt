package ru.stimmax.lessons.lesson05



    val sum = 10 + 5 // 15
    val diff = 10 - 5 // 5
    val product = 10 * 5 // 50
    val quotient = 10 / 5 // 2
    val remainder = 10 % 5 // 0
    val remainder1 = 10 % 6 // 4
    val remainder2 = 10 % 4 // 2


    val isEqual = ("A" == "r")  // true
    val isNotEqual = (5 !=5) // false
    val isGreater = (5 > 3) // true
    val isLesser = (5< 3) // false
    val isGreaterOrEqual = (5>=5) // true
    val isLesserOrEqual = (5 <= 3) // false


    val andResult = (5 > 3) && (5 > 4) // true
    val orResult = (5 > 3) || (5 < 4) // true
    val notResult = !(5 > 3) // false

//    var number = 5
//    number += 3 // number теперь равно 8
//    number = number + 3
//   number -= 2
//    number *= 4
//    number /= 5
//   number %= 4


    // инкременты и декременты????

 //   val r = ++number
  //  val r = number++
 //   --number


    var a = 5
    var b = a++ // инкремент постфиксный
 //   println ("a: $a")
 //   println ("b: $b")


    var c = 5
    var d = ++c // инкремент префиксный
 //   println ("c: $c")
 //   println ("d: $d")

        // Приоритеты арифметических и логических операций в Котлин
    // скобочки () в приоритете
    // умножение и деление
    // сложение и вычитание

    val rr = 3 + 4 * 5


    // скобочки, потом НЕ/not - или - тру или фолс
    val rrr = (true || false) && !true



    // оператор Элвиса
    val name: String? = null
    val result = name ?: "Unknown" // "Unknown", так как name равно null
//    println(result)






    val userVolume: Int? = null
    val defaultValue = 30
//    println(userVolume ?: defaultValue)




//Задача: вывести текущий уровень громкости аудиосистемы. Известно, что после перезагрузки,
// пользовательский уровень громкости не назначен.
//Дефолтный уровень громкости равен 30%.

fun main() {
    printVolume(null)
    printName(userName = null)
}

fun printVolume(userVolume: Int?) {
    val defaultVolume = 30
    println(userVolume ?: defaultVolume)
}

fun printName(userName: String?) {
    val name: String = "Гость"
    println(userName ?: name)

}
