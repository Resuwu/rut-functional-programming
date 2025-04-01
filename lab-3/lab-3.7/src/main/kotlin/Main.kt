package org.example

fun main() {
    while (true) {
        print("Enter first number: ")
        val first = readln().toIntOrNull()?: continue

        print("Enter second number: ")
        val second = readln().toIntOrNull()?: continue

        println(isBothNumbersAreEven(first, second).toString())
    }
}

fun isBothNumbersAreEven(first: Int, second: Int): Boolean {
    // По заданию нужно выполнить проверку при помощи конструкции if/else в
    // виде выражения в сокращенной форме, хотя это не требуется для логических выражений
    val isEven = { number: Int -> if (number % 2 == 0) true else false }

    return isEven(first) && isEven(second)
}