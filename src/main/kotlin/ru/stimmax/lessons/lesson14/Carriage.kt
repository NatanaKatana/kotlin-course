package ru.stimmax.lessons.lesson14

import kotlin.collections.remove
import kotlin.text.compareTo

data class Carriage(val capacity: Int, val type: String = "Плацкарт") {
    private val passengers = mutableMapOf<Int, Passenger>()
    fun boardPassenger(passenger: Passenger, seat: Int) {
        if (passengers.size < capacity) {
            passengers[seat] = (passenger)
        }
    }
    fun passengerGetOff(seat: Int) {
        passengers.remove(seat)
    }
}

