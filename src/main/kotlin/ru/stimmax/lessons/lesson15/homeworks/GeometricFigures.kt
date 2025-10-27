package ru.stimmax.lessons.lesson15.homeworks

open class GeometricFigures(
    val name: String,
    val square: Double
) {}

open class Polygon(
    name: String,
    square: Double,
    val numberOfAngles: Int
) : GeometricFigures(name, square) {}

class Circle(
    name: String,
    square: Double
) : GeometricFigures(name, square) {}

class Triangle(
    name: String,
    square: Double,
    numberOfAngles: Int = 3
) : Polygon(name, square, numberOfAngles) {}

class Quadrangle(
    name: String,
    square: Double,
    numberOfAngles: Int = 4
) : Polygon(name, square, numberOfAngles) {}
