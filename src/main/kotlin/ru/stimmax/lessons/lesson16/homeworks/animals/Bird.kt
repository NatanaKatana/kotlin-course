package ru.stimmax.lessons.lesson16.homeworks.animals

class Bird : Animal() {
   override fun makeSound() {
        val blue = "\u001B[34m"
        val reset = "\u001B[0m"
        println("${blue}Bird makes sound: Tweet${reset}")
    }
}