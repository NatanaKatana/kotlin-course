package ru.stimmax.lessons.lesson14

data class Train(val engineType: String) {
    val carriages = mutableListOf<Carriage>()
    fun boardPassenger(
        passenger: Passenger,
        seat: Int,
        carriageType: String
    ) {
        // логика для размещения пассажира
    }
}


