package ru.stimmax.lessons.lesson10

fun main () {

    val pair = 1 to "a"

    val emptyMap = mapOf<String, String> ()

    val capitals = mapOf("Россия" to "Москва", "Франция" to "Париж")

    val mapp: Map<Int, String> = mapOf(1 to "a", 2 to "b", 3 to "c")

    val mutableCapitals = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")


//    Добавление и удаление элементов:

    mutableCapitals["Германия"] = "Берлин"   // добавление
    mutableCapitals.remove("Франция")  //  удаление

//    Примеры работы со словарями
//            Доступ к элементам:

    val capitalOfRussia = capitals["Россия"]
println(capitalOfRussia)

//    Перебор элементов:

    for ((country, capital) in capitals) {    //  переменные в первых скобках мы придумываем сами
        println("$country: $capital")   // выводим на печать через шаблон
    }

//    Условия:

    // входит ли ключ в словарь
    if ("Россия" in capitals) {     // если в словаре кэпиталс есть значене "Россия", то
        println("Столица России: ${capitals["Россия"]}")
    }



    val map = mutableMapOf("a" to 1, "b" to 2)
    map["a"] = 3  // значение по ключу "a" теперь будет 3, а не 1

//    Ключи и Null

   // В Kotlin ключи в словарях могут быть null, хотя это и не является обычной практикой.
    // Использование null в качестве ключа следует рассматривать осторожно, так как это может привести
    // к ошибкам в логике программы и затруднить отладку:
    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1)


    // значения могут быть неуникальными
    val map1 = mutableMapOf("a" to 1, "b" to 1, "c" to 2)

}