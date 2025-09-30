package ru.stimmax.lessons.lesson08


fun main() {

    val simpleString = "Это простая строка"


// Конкотинация строк = соединение

    val firstName = "Иван"
    val lastName = "Пупкин"
    val fullName =
        firstName + " " + lastName // Иван Пупкин, пробел нужен чтобы между словами был пробел, иначе будет слитно
    println(fullName)


// Шаблоны строк

    val age = 30
    val greeting = "Привет, меня зовут $firstName, и мне $age лет."
    println(greeting)


    // Обращение к

    class Person(val name: String, val age: Int)

    val person = Person("Алексей", 25)
    val introduction = "Меня зовут ${person.name}, и мне ${person.age} лет"
    println(introduction)

    val details = "Здесь находятся ${"очень интересные детали"}"
    println(details)

    val x = 10
    val y = 20
    val resultString = "Результат сложения x и y равен ${x + y}"
    println(resultString)

    val originalString = "Kotlin is fun"
    val subString = originalString.substring(7) // "is fun"
    val subString2 = originalString.substring(3, 6) // "lin"

    // replace - замена
    val replacedString = originalString.replace("i", "awesome") // "Kotlin is awesome"
    println(replacedString)

    val words = originalString.split("") // ["Kotlin", "is", "fun"]
    println(words)

    val length = "Hello".length //5
    println(length)

    val upper = "hello".uppercase() //"HELLO"
    val lower = "HELLO".lowercase() // "hello"

    val trimmed = "  hello  ".trim()  // "hello" - чистит пробелы

    val starts = "Kotlin".startsWith("Kot", true) // true

    val ends = "Kotlin".endsWith("lin", true) // true

    val contains = "Hello".contains("ell") // true

    // ignorCase = true - игнорирование регистра


    val s: String? = null
    val empty = s.isNullOrEmpty()  // true
    val blank = s.isNullOrBlank()  // true

    val repeat = "ab".repeat(3) // "ababab"
    println(repeat)

    val letter = originalString[5] // 'n'

//   val letter = originalString.get(5) // 'n'

    val indexOfChar: Int = "Kotlin".indexOf("li")

    val indexOfWord = "Kotlin is the best language".indexOf("bett")

    val backReverse = "niltoK".reversed()

    // Многострочные строки
    val multiLineString = """
    Первая строка
    Вторая строка
    Третья строка
    """.trimIndent() // очищает при выводе на консоль лишние пробелы и тд. Берет "наименьший" пробел и вычтет у других

    println(multiLineString)

//
//    val name1 = "Алексей"
//    val city = "Москва"
//    val age1 = 32
//    val friendsCount = 1052
//    val rating = 4.948
//    val balance = 2534.75856
//    val text = """
//        Имя: %s
//        Возраст: %s
//        Количество друзей: %,d
//        Рейтинг пользователя: %.1f
//        Баланс счета: $%,.2f
//    """.trimIndent()
//    println(text.format(name1, city, age1, friendsCount, rating, balance))
//
//    /*
//    Результат:
//
//    Имя: Алексей
//    Город: Москва
//    Возраст: 32
//    Количество друзей: 1 052
//    Рейтинг пользователя: 5,0
//    Баланс счета: 2534,76
//     */

}

fun getDetails(): String {
    return "Очень интересные детали"
}


