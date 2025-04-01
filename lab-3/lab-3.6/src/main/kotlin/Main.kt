package org.example

import kotlin.math.abs

fun main() {
    while (true) {
        print("Enter import value: ")
        val import = readln().toIntOrNull()?: continue

        print("Enter export value: ")
        val export = readln().toIntOrNull()?: continue

        println(countProfits(import, export))
    }
}

fun countProfits(losses: Int, profits: Int): String {
    val delta = abs(profits - losses)

    return if (profits > losses) "Ваша прибыль составила $delta" else "Ваши убытки составили $delta"
}