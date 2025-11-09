package ru.stimmax.lessons.lesson17.homeworks
//Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var)
// и методов (аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)

class SlotMachine(
    val color: String,
    val model: String,
    val haveJoystick: Boolean
) {
    //Поля:
    private var powerOn: Boolean = false
    private var osIsLoaded: Boolean = false
    private var listOfInstalledGames: List<String> = mutableListOf("GTA", "Mario")
    private var pin: String = "1234"
    private var owner: String = ""
    var supportPhone = ""
    private var sessionCost = 5.0
    private var balance = 0.0
    private var gameSessionIsPayed = false

//Методы:

    //+ включить
    private fun turnOn() {
        powerOn = true
    }
    //+ выключить
    private fun turnOff() {
        powerOn = false
    }

    //+ загрузить ОС
    private fun loadOS() {
        println("ОС загружена")
    }
    //+ завершить работу ОС
    private fun shutDownOs() {
        println("Работа ОС завершена")
    }

    //+ показать список игр
    fun showGames() = listOfInstalledGames.toList()

    //включить игру
    fun play(gameName: String) {
        if (!gameSessionIsPayed) {
            println("Оплати игру прежде чем начать")
            return
        }
        if (gameName !in listOfInstalledGames) {
            println("Игра '$gameName' не найдена")
        } else {
            println("Игра '$gameName' запущена")
        }
        gameSessionIsPayed = false
    }

    //оплатить игровой сеанс
    fun pay() {
        balance += sessionCost
    }


    //забрать наличные с помощью пин-кода
    fun withdraw(pin: String): Double {
        if (pin != this.pin) {
            return 0.0
        }
        return openSafe()
    }


    //открыть сейф и выдать наличные
    private fun openSafe(): Double {
        val withdraw = balance
        balance = 0.0
        return withdraw
    }

}



