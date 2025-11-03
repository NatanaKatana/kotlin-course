package ru.stimmax.lessons.lesson16.homeworks.logger

import ru.stimmax.lessons.Background
import ru.stimmax.lessons.Colors

class Logger {
    // ---------- 2.1 Базовый метод log (INFO) ----------
    fun log(message: String) {
        println("${Colors.GREEN}[INFO] $message${Colors.RESET}")
    }

    // ---------- 2.2 Перегрузка: уровень и сообщение ----------
    fun log(level: String, message: String) {
        when (level.uppercase()) {
            "INFO" -> println("${Colors.GREEN}[INFO] $message${Colors.RESET}")
            "WARNING" -> println("${Colors.YELLOW}[WARNING] $message${Colors.RESET}")
            "ERROR" -> println("${Colors.WHITE}${Background.RED}[ERROR] $message${Colors.RESET}")
            "DEBUG" -> println("${Colors.CYAN}[DEBUG] $message${Colors.RESET}")
            else -> println("[UNKNOWN] $message")
        }
    }

    // ---------- 2.3 Перегрузка: список сообщений ----------
    fun log(messages: List<String>) {
        for (msg in messages) {
            log(msg)  // вызывает базовый метод с уровнем INFO
        }
    }

    // ---------- 2.4 Перегрузка: Exception ----------
    fun log(exception: Exception) {
        log("ERROR", exception.message ?: "Ошибка без сообщения")
    }
}