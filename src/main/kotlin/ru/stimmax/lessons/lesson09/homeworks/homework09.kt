package ru.stimmax.lessons.lesson09.homeworks

fun main() {


//1. Работа с массивами Array

//1.1.Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val ex1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("Задание 1.1: ${ex1.joinToString()}")

//1.2.Создайте пустой массив строк размером 10 элементов.
    val ex2: Array<Int> = Array(10) { 0 }
    println("Задание 1.2: ${ex2.joinToString()}")

//1.3.Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val ex3: Array<Double> = Array(5) { i -> (i * 2).toDouble() }
    println("Задание 1.3: ${ex3.joinToString()}")

//1.4.Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение,
// равное его индексу, умноженному на 3.
    val ex4: Array<Int> = Array(10) { 0 } // создаём массив из 5 элементов, все по умолчанию 0
    for (i in ex4.indices) {   //перебираем индексы (от 0 до 4).
        ex4[i] = i * 3         //кладём в ячейку массива значение индекс * 3.
    }
    println("Задание 1.4: ${ex4.joinToString()}")

//1.5.Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val ex5: Array<String?> = arrayOf(null, "я в шоке", "мне ничего не понятно")
    println("Задание 1.5: ${ex5.joinToString()}")

//1.6.Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val ex6: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val copy: Array<Int> = Array(ex6.size) { 0 }  // создаём новый массив такой же длины, заполненный нулями
    for (i in ex6.indices) {   // копируем элементы через цикл
        copy[i] = ex6[i]
    }
    println("Задание 1.6")
    println("Исходный массив: ${ex6.joinToString()}")
    println("Копия массива: ${copy.joinToString()}")


//1.7.Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
    val ex71: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val ex72: Array<Int> = arrayOf(6, 7, 8, 9, 10)
    val result7: Array<Int> = Array(ex71.size) { 0 }        // создаём третий массив такой же длины
    for (i in ex71.indices) {                 // цикл по индексам
        result7[i] = ex71[i] - ex72[i]   // вычитаем элемент из одного массива из другого
    }
    println("Задание 1.7: ${result7.joinToString()}")

//1.8.Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
    val ex8: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    var index = 0          // начинаем с нулевого индекса
    var foundIndex = -1    // сюда запишем индекс, если найдём число 5

    while (index < ex8.size) {         // пока индекс меньше длины массива
        if (ex8[index] == 5) {         // если нашли элемент со значением 5
            foundIndex = index         // запоминаем индекс
            break                      // выходим из цикла
        }
        index++                        // увеличиваем индекс, чтобы перейти к следующему элементу
    }

    println("Задание 1.8: $foundIndex")

//1.9.Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
// Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    println("Задание 1.9")
    val ex9: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
    for (num in ex9) {
        if (num % 2 == 0) {
            println("$num — чётное")
        } else {
            println("$num — нечётное")
        }
    }


//1.10.Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент,
// в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
    println("Задание 1.10")

    val ex10: Array<String> = arrayOf("Палец", "Маршрутка", "Спектакль", "Клоун")
    val string10 = "Клоун"

    for (words in ex10) {
        if (words.contains(string10)) {
            println("$string10")
        }
    }


//2.Работа со списками List


//2.1 Создайте пустой неизменяемый список целых чисел.
    val ex21: List<Int> = emptyList()
    println("Задание 2.1: ${ex21.joinToString()}")

//2.2 Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val ex22: List<String> = listOf("Hello", "World", "Kotlin")
    println("Задание 2.2: ${ex22.joinToString()}")

//2.3 Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val ex23: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println("Задание 2.3: ${ex23.joinToString()}")

//2.4 Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    val ex24: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    ex24.add(6)   // добавляем один элемент
    ex24.addAll(listOf(7, 8))   // добавляем сразу несколько элементов
    println("Задание 2.4: ${ex24.joinToString()}")


//2.5 Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val ex25: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    ex25.remove("World")
    println("Задание 2.5: ${ex25.joinToString()}")

//2.6 Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    println("Задание 2.6")
    val ex26: List<Int> = listOf(10, 20, 30, 40, 50)
    for (number in ex26) {
        println(number)
    }

//2.7 Создайте список строк и получите из него второй элемент, используя его индекс.
    val ex27: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    val secondElement = ex27[1]  // индексы в списках начинаются с 0 // второй элемент имеет индекс 1
    println("Задание 2.5: Второй элемент списка: $secondElement")  // Вывод: World

//2.8 Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
    val ex28: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    ex28[2] = 99  // заменяем элемент с индексом 2 (третий элемент) на новое значение, например 99
    println("Задание 2.8: Обновлённый список: ${ex28.joinToString()}") // 1, 2, 99, 4, 5

//2.9 Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val list1: List<String> = listOf("Kotlin", "Java", "Scala")
    val list2: List<String> = listOf("Python", "C++", "Go")

    val combinedList: MutableList<String> = mutableListOf()    // пустой список для объединения - ИЗМЕНЯЕМЫЙ
    for (item in list1) {
        combinedList.add(item)    // добавляем элементы первого списка
    }
    for (item in list2) {
        combinedList.add(item)      // добавляем элементы второго списка
    }
    println("Задание 2.9: ${combinedList.joinToString()}")

//2.10 Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val numbers: List<Int> = listOf(105, 12, 3, 9, 21, 7, 1)
    var min = numbers[0]  // Инициализируем min и max первым элементом списка
    var max = numbers[0]
    for (num in numbers) {        // Перебираем все элементы списка
        if (num < min) min = num   // обновляем минимум
        if (num > max) max = num   // обновляем максимум
    }
    println("Задание 2.10: Минимальный = $min, Максимальный = $max")

//2.11 Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val ex211: List<Int> = listOf(5, 6, 7, 8, 9, 10)
    val newList211: MutableList<Int> = mutableListOf()
    for (element in ex211) {
        if (element % 2 == 0) {   // проверяем, чётное ли число
            newList211.add(element)   // добавляем в новый список
        }
    }
    println("Задание 2.11: ${newList211.joinToString()}")

//3 Работа с Множествами Set

//3.1 Создайте пустое неизменяемое множество целых чисел.
    val ex31: Set<Int> = setOf()
    println("Задание 3.1: ${ex31.joinToString()}")

//3.2 Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val ex32: Set<Int> = setOf(1, 2, 3)
    println("Задание 3.2: ${ex32.joinToString()}")

//3.3 Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val ex33: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
    println("Задание 3.3: ${ex33.joinToString()}")

//3.4 Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    val ex34: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
    ex34.addAll(listOf("Swift", "Go"))
    println("Задание 3.4: ${ex34.joinToString()}")

//3.5 Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val ex35: MutableSet<Int> = mutableSetOf(1, 2, 3)
    ex35.remove(2)
    println("Задание 3.5: ${ex35.joinToString()}")

//3.6 Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    println("Задание 3.5")
    val ex36: Set<Int> = setOf(1, 2, 3)
    for (num in ex36)
        println(num)

//3.7 Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
// Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    val ex37: Set<String> =
        setOf("Kotlin", "Java", "Scala", "Mamma mia", "Котики", "Пространственно-временной континуум", "Чебурашки")
    val string = "Mamma mia"
    val result = ex37.contains(string) // вызываем функцию и проверяем, есть ли "Kotlin"
    println("Задание 3.7: $result")


    fun containsWord(set: Set<String>, target: String): Boolean {
        for (word in set) {              // перебираем все элементы множества
            if (word == target) {        // если нашли совпадение
                return true              // сразу возвращаем true
            }
        }
        return false                     // если цикл закончился без совпадений
    }


//3.8 Создайте множество строк и конвертируйте его в изменяемый список строк с использованием цикла.

    val stringsSet: Set<String> = setOf("Кот-кокос", "Мышь-гашиш", "Гена", "Владивосток")
    val stringsList: MutableList<String> = mutableListOf()

    for (word in stringsSet) {    // перебираем все элементы множества
        stringsList.add(word)     // добавляем каждый элемент в список
    }

    println("Задание 3.8: ${stringsList.joinToString()}")

}