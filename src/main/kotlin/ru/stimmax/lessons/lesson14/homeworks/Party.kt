package ru.stimmax.lessons.lesson14.homeworks

class Party(val location: String, val attendees: Int) {


    fun details() {
        println("Место проведения вечеринки: $location, количество гостей: $attendees")
    }
}
