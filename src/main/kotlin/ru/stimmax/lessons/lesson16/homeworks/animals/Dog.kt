package ru.stimmax.lessons.lesson16.homeworks.animals

class Dog : Animal() {
    override fun makeSound() {
        val green = "\u001B[32m"
        val reset = "\u001B[0m"
        println("${green}Dog makes sound: Bark${reset}")
    }
}