package org.example

fun main() {
    while (true) {
        print("Enter your age: ");
        val age = readln().toIntOrNull()?: continue
        println(validateAge(age))
    }
}

fun validateAge(age: Int): String {
    return when {
        age < 18 -> "Вы еще слишком молоды"
        age == 18 -> "Ура, Вам 18 лет!"
        else -> "Вам уже все можно"
    }
}