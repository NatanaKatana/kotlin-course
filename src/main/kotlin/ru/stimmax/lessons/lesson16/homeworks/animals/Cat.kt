package ru.stimmax.lessons.lesson16.homeworks.animals

class Cat : Animal() {
    override fun makeSound() {
        val purple = "\u001B[35m"
        val reset = "\u001B[0m"
        println("${purple}Cat makes sound: Meow${reset}")
    }
}