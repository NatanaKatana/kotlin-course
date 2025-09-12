package ru.stimmax.lessons.lesson03

const val wheels = 4

class Auto {

//    val vincode: String = "VAJRHOWFI32"
    var color: String = "white"
    var mileage: Int = 0
    lateinit var ownername: String

    var utilreport: String by lazy {
        "sample text"
    }

}

val test = 1