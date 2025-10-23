package ru.stimmax.lessons.lesson12

fun main() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)

    val positive = mutableListOf<Int>()

    for (i in numbers) {
        val isPositive = i > 0
        if (isPositive) {
            positive.add(i)
        }
    }

//    Итерация коллекции через forEach
//            Функция forEach работает как цикл, перебирая каждый элемент коллекции,
//    помещая его в специальную переменную 'it' и выполняет блок кода с каждым элементом коллекции
    numbers.forEach {
        val isPositive = it > 0 // it - это специальная переменная для хранения значения коллекции из текущей итерации
        if (isPositive) {
            positive.add(it)
        }
    }


    val list = listOf(8, 56, 23, 87, 12, 18, 11)


    val filtered1 = filter(list)
    println(filtered1)




    val filtered2 = list.filter {
        it in 7..17
    }
    println(filtered2)

//filter - Этот метод позволяет задать правило, по которому элементы будут отбираться.
    val positiveFiltered = numbers.filter { it > 0 }

//    filterNot - Похож на filter, но выбирает элементы, которые не соответствуют условию.
    val notPositiveNumbers = numbers.filterNot { it > 0 }
    println(notPositiveNumbers) // Вывод: [-1, -3, -5]

//    filterNotNull - Используется для отбрасывания всех null значений из коллекции.
    val nullableList = listOf(1, null, 2, null, 3)
    val nonNullList = nullableList.filterNotNull()
    println(nonNullList) // [1, 2, 3]

    list.first { it > 0 }

    list.last { it > 0 }

// first - нужно взять первый элемент множества
// last - взять последний элемент коллекции
    val setOfNumbers = setOf(3, 4, 5, -5, 14)
    val firstElement = setOfNumbers.first()
    val lastElement = setOfNumbers.last()


    // firstOrNull или lastOrNull возвращает первый или последний элемент,
    // который соответствует условию, или null, если такого элемента нет.
    val firstPositive = numbers.firstOrNull { it > 0 } // 2

    val nullable = numbers.firstOrNull { it > 1000 } // null

    // getOrElse возвращает элемент по индексу или значение по умолчанию, если индекс вне диапазона списка.
    val elementOrElse = numbers.getOrElse(10) { -1 }  // -1


    //Преобразование коллекции - map -> список
    // Преобразует каждый элемент коллекции согласно заданной функции.
    val incrementedNumbers = numbers.map { it + 1 }
    println(incrementedNumbers) // [0, 3, -2, 5, -4]

    // associate -> словарь
    // Создает словарь (Map) из списка, используя предоставленную функцию для генерации ключей.
    // Пример: Создать словарь, где каждому числу соответствует его квадрат.
    val numberSquareMap: Map<Int, Int> = numbers.associate { it to it * it }
    println(numberSquareMap) // {-1=1, 2=4, -3=9, 4=16,-5=25}


    //flatten - Склеивает каждую коллекцию в коллекции между собой в одну общую коллекцию.
    val multipleList = listOf(
        listOf(1, 2, 3),
        listOf(
            4, 5, 6
        )
    )
    val flattenLis = multipleList.flatten()


    //flatMap - Выполняет одновременно преобразование вложенных коллекций и склеивание в одну общую коллекцию.
    val flattenListAfterMapping = multipleList.flatMap { list ->
        list.map { it * 2 }
    }
    println(flattenListAfterMapping)


    //joinToString Преобразует все элементы коллекции в строки и объединяет их в одну строку с заданным разделителем.
    //Пример: Преобразовать список чисел в строку, разделенную запятыми
    val kjk = numbers.joinToString(" : ")  // {"${it*2}"} - можно еще так добавить
    print(kjk) // "-1, 2. -3, 4, -5"


    // Сортировка Коллекций

    // sorted - сортирует элементы коллекции в возрастающем порядке.

    val sortedNumbers = numbers.sorted()
    println(sortedNumbers) // Вывод: [-5, -3, -1, 2, 4]

//    sortedDescending -  сортирует элементы в убывающем порядке.
    val sortedDescendingNumbers = numbers.sortedDescending()
    println(sortedDescendingNumbers) // Вывод: [4, 2, -1, -3, -5]

//    Длина коллекции - size возвращает длину коллекции.
    println(numbers.size)

//    Проверка коллекции isEmpty - Проверяет, является ли коллекция пустой
    if (numbers.isEmpty()) {
        println("Коллекция пуста")
    } else {
        println("В коллекции ${numbers.size} значений")
    }

//    isNotEmpty - Проверяет, что коллекция не пустая. Команда противоположна предыдущей.
//
//    contains - Проверяет, что коллекция содержит нужный элемент.

    if (numbers.contains(42)) {
        println("Коллекция содержит ответ на главный вопрос")
    } else {
        println("В коллекции нет ответа на главный вопрос")
    }

//    Так же можно использовать оператор in.

    if (42 in numbers) {
        println("Коллекция содержит ответ на главный вопрос")
    } else {
        println("В коллекции нет ответа на главный вопрос")
    }

//    containsAll - Проверяет вхождение одной коллекции в другую.

    if (setOfNumbers.containsAll(listOf(4, 3))) {
        println("Коллекция содержит числа 4 и 3, при этом порядок не имеет значения")
    } else {
        println("В коллекции нет одного из чисел либо всех проверяемых чисел")
    }


//    sum -  sum возвращает сумму всех элементов списка чисел.
    val sumOfNumbers = numbers.sum()
    println(sumOfNumbers) // Вывод: -3


    // average - возвращает среднее значение элементов списка чисел.
    val averageOfNumbers = numbers.average()
    println(averageOfNumbers) // Вывод: -0.6


//    maxOrNull возвращает максимальный элемент списка или null, если список пуст.
//    minOrNull возвращает минимальный элемент или null.

    val maxNumber = numbers.maxOrNull()
    println(maxNumber) // Вывод: 4
    val minNumber = numbers.minOrNull()
    println(minNumber) // Вывод: -5

//    groupByb - Группирует элементы коллекции по заданному критерию.
//    Пример: Группировка чисел по положительным и отрицательным.
    val groupedBySign = numbers.groupBy { if (it > 0) "Positive" else "Negative" }
    println(groupedBySign) // Вывод: {"Negative"=[-1, -3, -5], "Positive"=[2, 4]}


//    distinct - Возвращает список, содержащий только уникальные элементы из исходного списка.
    val distinctNumbers = listOf(1, 2, 2, 3, 3, 3, 4).distinct()
    println(distinctNumbers) // Вывод: [1, 2, 3, 4]

//    take - Возвращает первые n элементов списка
    println(numbers.take(3)) // Вывод: [1, 2, 3]

//    takeLast - Возвращает последние n элементов
    println(numbers.takeLast(3)) // Вывод: [3, 4, 5]

//    drop - Возвращает всю коллекцию за исключением первых нескольких элементов
    println(numbers.drop(2)) // [-3, 4, -5, 8, 264]


}

fun filter(collection: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in collection) {
        if (i in 7..17) result.add(i)
    }
    return result
}