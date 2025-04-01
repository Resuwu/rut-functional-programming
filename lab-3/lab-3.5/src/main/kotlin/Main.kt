package org.example

fun main() {
    while (true) {
        print("Enter first number: ")
        val first = readln().toIntOrNull()?: continue

        print("Enter second number: ")
        val second = readln().toIntOrNull()?: continue

        print("Enter third number: ")
        val third = readln().toIntOrNull()?: continue

        println(middleNumber(first, second, third))
    }
}

fun middleNumber(first: Int, second: Int, third: Int): String {
    if (first == second || first == third || second == third)
        return "Ошибка"

    return "Number in the middle is: " +
            if (first < second)
                when {
                    second < third -> second.toString()
                    else -> third.toString()
                }
            else
                when {
                    first < third -> first.toString()
                    else -> third.toString()
                }
}