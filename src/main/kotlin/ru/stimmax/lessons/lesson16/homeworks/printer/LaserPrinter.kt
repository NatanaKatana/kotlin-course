package ru.stimmax.lessons.lesson16.homeworks.printer

import ru.stimmax.lessons.Background
import ru.stimmax.lessons.Colors

class LaserPrinter : Printer() {
    override fun printText(text: String) {
        text.split(" ").forEach { println("${Colors.BLACK}${Background.WHITE}$it${Colors.RESET}") }
    }


}
