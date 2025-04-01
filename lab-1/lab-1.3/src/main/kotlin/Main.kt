package org.example

import kotlin.math.abs
import kotlin.math.log10

fun main() {
    while (true) {
        print("Enter a 4 digit number: ")
        val number = readln().toIntOrNull()?: continue

        if (number.length() != 4) {
            println("Invalid input.")
            continue
        }

        println(splitNumber(number))
    }
}

fun splitNumber(number: Int): String {
    return when (val remainder = number / 10) {
        0 -> number.toString()
        else -> splitNumber(remainder) + ", " + abs(number % 10).toString()
    }
}

fun Int.length() = when(this) {
    0 -> 1
    else -> log10(abs(toDouble())).toInt() + 1
}