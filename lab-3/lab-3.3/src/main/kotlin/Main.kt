package org.example

fun main() {
    print("Enter the first number: ")
    val left = readln().toInt()

    print("Enter the second number: ")
    val right = readln().toInt()

    println("""
        -= Menu =-
        1. Addition
        2. Subtraction
        3. Exit
        
    """.trimIndent())

    while (true) {
        print("Enter your choice: ")
        val choice = readln().toInt()

        when (choice) {
            1 -> println("Result: ${left + right}")
            2 -> println("Result: ${left - right}")
            3 -> break
            else -> println("Invalid choice!")
        }
    }
}