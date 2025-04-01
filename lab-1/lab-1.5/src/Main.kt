fun main() {
    while(true) {
        println("Enter a number: ")
        val number: Int = readln().toIntOrNull()?: continue

        println("Result: $number${number * 2}")
    }
}

