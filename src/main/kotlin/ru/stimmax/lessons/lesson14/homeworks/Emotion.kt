package ru.stimmax.lessons.lesson14.homeworks

data class Emotion(val type: String, val intensity: Int) {

    fun express() {
       println("Эмоция $type с интенсивностью $intensity")
    }
}
