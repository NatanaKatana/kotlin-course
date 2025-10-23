package ru.stimmax.lessons.lesson14
//Объектно-ориентированное программирование (ООП) - это парадигма программирования,
// которая использует "объекты" для моделирования данных и поведения программы.
// Основные концепции ООП включают классы и объекты, наследование, инкапсуляцию,
// полиморфизм и абстракцию.

fun main() {
    val reservedSeatCarriage = Carriage(48)
    val compartmentCarriage = Carriage(16, "Купе")
    val train = Train("Electric locomotive")
    train.carriages.add(reservedSeatCarriage)
    train.carriages.add(compartmentCarriage)
    val passengerAlexandr = Passenger("Alexandr", "02.10.1983", "")
    train.boardPassenger(passengerAlexandr, 10, "Купе")


    Logger.log("Application started")
//Здесь Logger — это синглтон, и его методы доступны без создания экземпляра.

    val result = Calculator.add(5, 3)
    println("Result: $result")
//Здесь companion object содержит метод add(), который можно вызвать без создания экземпляра класса Calculator.


    val user1 = User(1, "Alice")
    val user2 = user1.copy(name = "Bob")
    println(user1) // Output: User(id=1, name=Alice)
    println(user2) // Output: User(id=1, name=Bob)

//data class автоматически генерирует полезные методы.
//Функция copy() позволяет легко создавать копии объектов, меняя нужные поля.

}

//Object

//object в Kotlin используется для создания синглтонов, то есть классов, которые могут иметь
// только один экземпляр.
//Это удобно, когда вам нужен глобальный объект, например, менеджер конфигурации или логгер.

object Logger {
    fun log(message: String) {
        println("Log: $message")
    }
}


//Companion object

//Если вам необходимо создать что-то похожее на статическое поле или метод (как в Java), в Kotlin используется
//companion object. Он позволяет объявить статические методы и переменные, которые принадлежат самому классу,
//а не конкретному его экземпляру:

class Calculator {
    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }
}


//Data class

//data class — это специальный вид классов в Kotlin, который предназначен для хранения
// данных. Они автоматически предоставляют полезные функции, такие как
// toString(), equals(), hashCode(), и copy(). Пример:

data class User(val id: Int, val name: String)








fun main01() {
    val person = Person("John", 30)
    person.sayHello()
}

class Person(val name: String, var age: Int) {
    // Метод класса
    fun sayHello() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

//val name: String — неизменяемое свойство (аналог final в Java).
//var age: Int — изменяемое свойство.
//sayHello() — метод, который выводит приветствие с использованием свойств класса.




