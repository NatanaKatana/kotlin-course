package ru.stimmax.lessons.lesson08

fun main() {

    example1("Ошибка в системе вызвало панику!")
}

fun example1(arg: String) {
    val result = when {
        arg.startsWith("Ошибка") -> arg.replace(
            "Ошибка",
            "Небольшое недоразумение"
        )

        arg.endsWith("Важно") -> "$arg ...но не критично."
        else -> arg
    }
    println(result)
}

