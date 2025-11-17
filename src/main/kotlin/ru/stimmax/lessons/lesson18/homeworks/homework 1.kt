package ru.stimmax.lessons.lesson18.homeworks

import java.io.InputStream

//Интерфейсы для работы

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

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
    fun getChargeLevel(): Double
    fun recharge()
}

//Задача 1. Создай абстрактные классы устройств, используя эти интерфейсы. Реализовывать методы не нужно.

//Холодильник
abstract class Fridge : Powerable, Openable, TemperatureRegulatable, Drainable, LightEmitting, SoundEmitting

//Стиральная машина
abstract class WashingMachine : Powerable, Openable, WaterContainer, TemperatureRegulatable,
    WaterConnection, AutomaticShutdown, Drainable, Timable, Mechanical, Programmable

//Умная лампа
abstract class SmartLamp : Powerable, LightEmitting, Programmable

//Электронные часы
abstract class ElectronicWatches : Powerable, BatteryOperated, LightEmitting, SoundEmitting, Programmable, Rechargeable

//Робот-пылесос
abstract class RobotVacuumCleaner : Powerable, WaterContainer, AutomaticShutdown, Timable, Mechanical, Programmable,
    Movable, Cleanable, Rechargeable

//Механические часы
abstract class MechanicalWatches : BatteryOperated, Mechanical

//Фонарик
abstract class Lantern : Powerable, BatteryOperated, LightEmitting

//Кофемашина
abstract class CoffeeMachine : Powerable, Openable, WaterContainer, WaterConnection, Drainable, Mechanical, Programmable

//Умная колонка
abstract class SmartSpeaker : Powerable, BatteryOperated, SoundEmitting, Rechargeable


//Задача 2. Создай абстрактный класс для включаемого оборудования и имплементируй соответствующий
// интерфейс с реализацией методов (достаточно println с выполняемым действием).

abstract class SwitchableDevices(val name: String) : Powerable {
    private var deviceState: Boolean = false

    override fun powerOn() {
        deviceState = true
        println("$name включено.")
    }

    override fun powerOff() {
        deviceState = false
        println("$name выключено.")
    }

    protected fun getDeviceState() = deviceState

}


//Задача 3. Создай абстрактный класс для программируемого оборудования (с имплементацией
// соответствующего интерфейса и реализацией методов) и наследуй его от абстрактного класса включаемого оборудования.
abstract class ProgrammableDevices(val arg: String, name: String) :
    SwitchableDevices(name), Programmable {


    private var currentAction: String? = null

    override fun programAction(action: String) {
        currentAction = action
        println("$name: действие \"$action\" запрограммировано.")
    }

    override fun execute() {
        if (currentAction != null) {
            println("$name: действие \"$currentAction\" запрограммировано.")
        } else {
            println("$name: действие не задано.")
        }
    }

    protected fun currentDeviceAction() = currentAction

}


//Задача 4. Создай абстрактный класс оборудования с возможностью устанавливать температуру и открываться
// и с наследованием от программируемого оборудования. Также имплементируй интерфейсы.

abstract class ThermalDevice(
    name: String,
    arg: String,
    override val maxTemperature: Int
) : ProgrammableDevices(arg, name), TemperatureRegulatable, Openable {

    private var currentTemp: Int = 20
    private var isOpen: Boolean = false

    override fun setTemperature(temp: Int) {
        if (temp <= maxTemperature) {
            currentTemp = temp
            println("$name: температура установлена на $temp")
        } else {
            println("$name: невозможно установить $temp - превышен максимум $maxTemperature")
        }
    }
    override fun open () {
        if (!isOpen) {
            isOpen = true
            println ("$name открытою")
        } else {
            println ( "$name уже открытою")
        }
    }


    override fun close() {
        if (isOpen) {
            isOpen = false
            println("$name closed.")
        } else {
            println("$name already closed")
        }
    }
}


//Задача 5. Создай не абстрактные классы устройств с наследованием от абстрактного класса с возможностью
// устанавливать температуру и открываться. Пусть это будет холодильник, стиральная машина, чайник, духовка.
// Добавь недостающие интерфейсы и реализуй необходимые методы (достаточно вывод в консоль производимого действия).
// Обрати внимание на то, что установка температуры и программирование устройства (считай - задание режима работы)
// не имеет смысла при выключенном питании - добавь эту проверку.


//Создай объекты этих устройств и позапускай их с различными методами.