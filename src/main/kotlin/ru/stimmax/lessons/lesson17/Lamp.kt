package ru.stimmax.lessons.lesson17
//1. Инкапсуляция полей

//Класс "Лампа": Разработайте класс Lamp с приватными полями isOn (включена ли лампа) и публичными
//методами turnOn() и turnOff() для управления состоянием лампы.

class Lamp() {

    private var isOn: Boolean = false

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun shine(): Boolean {
        return isOn
    }
}
