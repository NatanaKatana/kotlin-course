package ru.stimmax.lessons.lesson16

import ru.stimmax.lessons.Background
import ru.stimmax.lessons.Colors

//Переопределение методов

//Базовый Класс MusicalInstrument: Создайте базовый класс для музыкальных
// инструментов с методом playNote(), который принимает название ноты.

//Производные Классы: Разработайте несколько производных классов для
// конкретных инструментов (например, Violin, Cello, Flute, Drum).
// В каждом классе реализуйте метод playNote(), чтобы он выводил в консоль
// уникальное сообщение о том, как этот инструмент играет данную ноту.

//Демонстрация Полиморфизма: Создайте массив или список объектов MusicalInstrument,
// включающий разные инструменты. Пройдитесь по массиву и вызовите метод playNote()
// для каждого инструмента, демонстрируя, как один и тот же метод может быть реализован
// по-разному.

//Для стилизации вывода “звука” разных музыкальных инструментов используем цвет.




fun printColored(text: String, color: String, backgroundColor: String = "") {
    println("$color$backgroundColor$text${Colors.RESET}")
}

abstract class MusicalInstrument {
    abstract fun playNote(note: String)
    protected fun shortNote(note: String, color: String) {
        printColored("Play short note $note", color)
    }

    protected fun longNote(note: String, color: String) {
        printColored("Play long note $note", color)
    }
}


class Violin : MusicalInstrument() {
    override fun playNote(note: String) {
        longNote(note, Colors.YELLOW)
    }
}

class Flute : MusicalInstrument() {
    override fun playNote(note: String) {
        shortNote(note, Colors.BLUE)
    }
}

class Drum : MusicalInstrument() {
    override fun playNote(note: String) {
        shortNote(note, Colors.RED)
    }
}


fun main() {
    val violin = Violin()
    violin.playNote("C")


    val drum = Drum()
    drum.playNote("E")

    val ensemble: List<MusicalInstrument> = listOf(violin, drum)

    val notes = "ABCDEFG"
    notes.forEach { note ->
        ensemble.forEach {
            it.playNote(note.toString())
        }
    }

    val printer = Printer()
    printer.print("First print type")
    printer.print("Second print type", Colors.PURPLE)
    printer.print("Third print type", Colors.BLACK, Background.YELLOW)
}


class Printer {
    fun print(text: String) {
        println(text)
    }

    fun print(text: String, color: String) {
        printColored(text, Colors.GREEN)
    }

    fun print(text: String, color: String, backgroundColor: String) {
        printColored(text, color, backgroundColor)
    }

    fun print(text: Array<String>) {
        text.forEach { println(it) }
    }

    fun print(coloredText: List<Pair<String, String>>) {
        coloredText.forEach { printColored(it.first, it.second) }
    }
}