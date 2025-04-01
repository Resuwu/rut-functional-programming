package org.example

fun main() {
    while (true) {
        print("Enter day of week number: ")
        val dayOfWeek = readln().toIntOrNull()?: continue

        when (dayOfWeek) {
            1 -> println("Понедельник")
            2 -> println("Вторник")
            3 -> println("Среда")
            4 -> println("Четверг")
            5 -> println("Пятница")
            6 -> println("Суббота")
            7 -> println("Воскресенье")
            else -> println("Invalid input!")
        }
    }
}