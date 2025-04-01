package org.example

fun main() {
    while (true) {
        print("Enter amount of years: ")
        val years = readln().toIntOrNull()?: continue
        println(addEnding(years))
    }
}

fun addEnding(years: Int): String {
    return when (years % 100) {
        in 11..19 -> "$years лет"
        else -> when (years % 10) {
            1 -> "$years год"
            in 2..4 -> "$years года"
            else -> "$years лет"
        }
    }
}