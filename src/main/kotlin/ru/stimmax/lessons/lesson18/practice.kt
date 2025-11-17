package ru.stimmax.lessons.lesson18

import java.io.InputStream

//Создай интерфейсы по их описанию:

//Интерфейс для включаемого объекта (можно включить и выключить)
interface Powerablee {
    fun turnOn()
    fun turnOff()
}
//Интерфейс для открываемого объекта (можно открыть и закрыть)
interface Openable {
    fun open()
    fun close()
}

// Примеры для дальнейшей практической работы

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getCapacity(): Double
    fun recharge()
}

//Используя эти интерфейсы, реализуй абстрактные классы для бытовой техники:
//
//Электрический чайник - Powerable, WaterContainer, Timable
abstract class Teapod: Powerable, Openable, WaterContainer, AutomaticShutdown, Timable

//Пылесос - Powerable, Movable, Cleanable
abstract class VacuumCleaner: Powerable, Cleanable, Movable

//Микроволновая печь - Powerable, Openable, Timable, TemperatureRegulatable

//Портативная колонка - BatteryOperated, SoundEmitting, Rechargeable
abstract class portableSpeaker: Powerable, SoundEmitting, Timable, BatteryOperated, Rechargeable

//Духовка - Powerable, TemperatureRegulatable, Timable, Openable
abstract class oven: Powerable, TemperatureRegulatable, Openable, Timable, SoundEmitting

//Блендер - Powerable, Openable, Cleanable
//Водонагреватель - Powerable, WaterContainer, TemperatureRegulatable
//Игрушечный автомобиль - BatteryOperated, Movable, SoundEmitting
//Увлажнитель воздуха - Powerable, WaterContainer, LightEmitting
//Электрическая зубная щётка - BatteryOperated, Rechargeable, Cleanable
//Вентилятор - Powerable, Movable (направление воздушного потока)
//Умный дверной замок - BatteryOperated, Programmable, Openable
//
//Напиши функцию, которая принимает объект типа Powerable и выключает его.
//Примени эту функцию к разными объектам, которые создавали в предыдущем задании
// (Электрический чайник, Холодильник, Механические часы)


fun closeObjects(list: List<Openable>) {
    list.forEach {
        it.close()
    }
}
