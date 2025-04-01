package org.example

fun main() {
    while (true) {
        print("Enter a number: ")
        val input = readln().toIntOrNull()?: continue
        println(roundThousands(input))
    }
}

fun roundThousands(number: Int): String {
    return when (val remainder = number / 1000) {
        0 -> number.toString()
        else -> remainder.toString() + "K"
    }
}