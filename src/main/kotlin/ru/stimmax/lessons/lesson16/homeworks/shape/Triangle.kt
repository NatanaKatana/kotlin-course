package ru.stimmax.lessons.lesson16.homeworks.shape

import kotlin.math.sin

class Triangle(
    val side1: Double,
    val side2: Double,
    val angleDegrees: Double
) : Shape() {
    val angleRadians = Math.toRadians(angleDegrees)
    override fun area(): Double {
        return 0.5 * side1 * side2 * sin(angleRadians)
    }
}