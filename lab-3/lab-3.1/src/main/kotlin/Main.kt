package org.example

fun main() {
    while (true) {
        print("Enter a number: ");
        val number = readln().toIntOrNull()?: continue

        print("Enter a divisor: ");
        val divisor = readln().toIntOrNull()?: continue

        if (number % divisor > 0) {
            println("Получилось значение большее чем ноль!")
        }
    }
}