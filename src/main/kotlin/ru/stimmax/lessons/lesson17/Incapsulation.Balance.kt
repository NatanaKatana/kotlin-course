package ru.stimmax.lessons.lesson17

import kotlin.math.min

//Инкапсуляция — это один из основных принципов ООП. Он играет ключевую роль в управлении доступом
// к данным и методам класса, защищая данные от некорректных изменений и предотвращая исполнение методов,
// не предназначенных для прямого вызова извне. Инкапсуляция позволяет скрыть детали реализации класса,
// предоставляя внешнему миру только необходимый интерфейс для взаимодействия с объектом.
//
//Инкапсуляция в Kotlin
//
//В Kotlin инкапсуляция реализуется с помощью модификаторов доступа: private, protected, internal и public.
// Эти модификаторы определяют уровень доступа к классам, полям, методам и конструкторам в вашем коде.
//
//Private: Члены класса доступны только внутри этого класса.
//Protected: Члены класса доступны внутри класса и в производных классах.
//Internal: Члены класса доступны в любом месте того же модуля.
//Public: Члены класса доступны отовсюду, где есть доступ к классу.

class Account(private var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun getBalance(): Double {
        return balance
    }

    fun withdraw(amount: Double): Double {
        if (amount > 0) {
            val withdraw = min(amount, balance)
            balance -= withdraw
            return withdraw
        }
        return 0.0
    }
}

fun main() {

    val account = Account(12.0)
//    account.balance()

    account.deposit(3.0)
    println("Текущий баланс ${account.getBalance()}")
    println("Хочу снять 12 и получаю ${account.withdraw(12.0)}")
    println("Текущий баланс ${account.getBalance()}")
    println("Хочу снять 10 но получаю ${account.withdraw(10.0)}")
    println("Текущий баланс ${account.getBalance()}")
}

//В этом примере поле balance скрыто от прямого доступа извне класса Account, тем самым защищая
//его от непреднамеренных изменений. Доступ к balance осуществляется через публичные методы deposit,
//getBalance и withdraw.




//Инкапсуляция конструкторов и классов
//
//Благодаря возможности скрыть конструктор можно добиться запрета на создание экземпляров класса напрямую и предоставить методы-инициализаторы, которые обеспечат правильную инициализацию конструктора.
//
//Приватные классы позволяют создавать скрытую архитектуру, нужную только для реализации механик внутри одного класса и не нужную во внешнем коде. Чтобы класс сделать приватным, он должен находиться либо в одном файле с другим классом, который его будет использовать, либо внутри другого класса. Следует понимать, что нельзя сделать публичными или protected поля, в типе которых указан приватный класс.

class SomeClass private constructor(val arg1: Int, val arg2: Int) {

    companion object {

        fun init(arg1: Int): SomeClass {
            return SomeClass(arg1, arg1 + 1)
        }
    }
    private val data = mutableListOf<AnotherClass>()

    fun add(arg: Int) {
        data.add(AnotherClass(arg + arg2))
    }

    fun get(): List<Int> {
        return data.map { it.arg }
    }
}

private data class AnotherClass(val arg: Int)