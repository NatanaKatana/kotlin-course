package ru.stimmax.lessons.lesson16.homeworks.shape

class Square(
    val side: Double
) : Shape() {
    override fun area(): Double {
        return side * side
    }
}