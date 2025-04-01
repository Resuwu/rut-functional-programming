fun main() {
    while (true) {
        print("Введите имя: ")
        var name: String = readlnOrNull()?: continue

        if (name.isBlank()) name = "Аноним"

        print("Введите возраст: ")
        val age: Int = readln().toIntOrNull()?: continue

        println("Привет, $name! Тебе уже $age")
    }
}