package ru.stimmax.lessons.lesson17
//Инкапсуляция методов
//Игровая Консоль

//Создайте класс GameConsole с публичным методом startGame(gameName: String).
//Внутри класса определите приватные методы initializeHardware() и loadGame(gameName: String),
//которые автоматически выполняются при вызове startGame(gameName). Пользователь не должен
//вызывать инициализацию аппаратного обеспечения и загрузку игры напрямую.



class GameConsole {

    fun startGame(gameName: String) {
        initializeHardware()
        loadGame(gameName)
    }

    private fun initializeHardware() {
    }

    private fun loadGame(gameName: String) {
    }




}