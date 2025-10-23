package ru.stimmax.lessons.lesson14.homeworks

object Moon {
    val isVisible: Boolean = true
    val phase: String = "Full Moon"

    fun showPhase() {
        if (isVisible) {
            println("Текущая фаза луны $phase")
        } else {
            println("Невозможно определить фазу луны из-за плохой видимости")
        }
    }
}

