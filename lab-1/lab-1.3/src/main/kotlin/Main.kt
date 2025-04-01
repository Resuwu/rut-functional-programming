package org.example

fun main() {
    while (true) {
        print("Enter a 4 digit number: ")
        val number = readln().toIntOrNull()?: continue
        println(splitNumber(number))
    }
}

fun splitNumber(number: Int): String {
    return when (val remainder = number / 10) {
        0 -> number.toString()
        else -> splitNumber(remainder) + ", " + (number % 10).toString()
    }
}