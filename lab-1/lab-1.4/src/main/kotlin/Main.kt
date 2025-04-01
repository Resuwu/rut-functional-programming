package org.example

fun main() {
    while (true) {
        print("Enter amount of days: ")
        val days = readln().toIntOrNull()?: continue
        println(convertDays(days))
    }
}

fun convertDays(days: Int): String {
    var temp = days;
    val years = temp / 365;
    temp %= 365;
    val weeks = temp / 7;
    temp %= 7;

    return "Лет: $years, недель: $weeks, дней: $temp"
}