package ru.stimmax.lessons.lesson14


class Passenger (
    //конструктор
    val name: String,
    private val dateOfBirth: String,
    private var phone: String
)
{
    // тело касса
    // поля - для хранения данных
//    private var age: Int = calculateAge()

    //поведение
//    private fun calculateAge(): Int {
//        return Period.between(
//            LocalDate.parse(dateOfBirth),
//            LocalDate.now()
//        ).years
//    }

    // публичная функциям
    fun recalculateAge() {
//        age = calculateAge()
    }
}


