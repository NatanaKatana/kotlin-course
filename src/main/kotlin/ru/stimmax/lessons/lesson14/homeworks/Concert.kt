package ru.stimmax.lessons.lesson14.homeworks

class Concert(
    val group: String,
    val location: String,
    val price: Double,
    val seatingCapacity: Int,
    private var soldedTickets: Int
) {
    fun information() {
        println("Концерт группы: $group, место проведения: $location, цена: $price, продано билетов: $soldedTickets")
    }

    fun buyTicket() {
        if (soldedTickets < seatingCapacity) {
            soldedTickets++
        }
    }

}

