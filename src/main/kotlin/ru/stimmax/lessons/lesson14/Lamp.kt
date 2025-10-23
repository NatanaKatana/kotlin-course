package ru.stimmax.lessons.lesson14

data class Lamp(var shine: Boolean) {

    fun turnOn() {
        shine = true
    }

    fun turnOff() {
        shine = false
    }

    fun toggle() {
        shine = !shine
        if (shine) {
            println("Включено")
        } else {
            println("Выключено")
        }

    }
}
