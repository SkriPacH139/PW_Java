
fun main() {
    val fileHandler = FileHandler()
    val caesarCipher = CaesarCipher()

    println("Выберите режим:")
    println("1. Шифрование")
    println("2. Расшифровка")
    println("3. Брут шифра")
    println("4. Выход")

    val choice = readLine()?.toIntOrNull() ?: 0

    when (choice) {
        1 -> {
            print("Введите путь к входному файлу: ")
            val inputFile = readLine() ?: ""

            print("Введите ключ (1-25): ")
            val key = readLine()?.toIntOrNull() ?: 0

            print("Зашифрованный файл encryptFile.txt\n")
            val outputFile = "encryptFile.txt"

            val currentDirectory = System.getProperty("user.dir")
            println("Файл будет сохранен в: $currentDirectory")


            if (fileHandler.validateFile(inputFile) && caesarCipher.validateKey(key)) {
                val text = fileHandler.readFile(inputFile) ?: return
                val encryptedText = caesarCipher.encrypt(text, key)
                fileHandler.writeFile(outputFile, encryptedText)
                println("Шифрование завершено.")
            }
            else {
                println("Ошибка: неверный путь к файлу или ключ.")
            }
        }
        2 -> {
            print("Введите путь к входному файлу: ")
            val inputFile = readLine() ?: ""

            print("Введите ключ (1-25): ")
            val key = readLine()?.toIntOrNull() ?: 0

            print("Расшифрованный файл decryptFile.txt\n")
            val outputFile = "decryptFile.txt"

            val currentDirectory = System.getProperty("user.dir")
            println("Файл будет сохранен в: $currentDirectory")

            if (fileHandler.validateFile(inputFile) && caesarCipher.validateKey(key)) {
                val text = fileHandler.readFile(inputFile) ?: return
                val encryptedText = caesarCipher.decrypt(text, key)
                fileHandler.writeFile(outputFile, encryptedText)
                println("Расшифровка завершена.")
            }
            else {
                println("Ошибка: неверный путь к файлу или ключ.")
            }
        }
        3->{
            print("Введите путь к входному файлу: ")
            val inputFile = readLine() ?: ""

            print("Расшифрованный файл decryptFile.txt\n")
            val outputFile = "brutFile.txt"

            val currentDirectory = System.getProperty("user.dir")
            println("Файл будет сохранен в: $currentDirectory")

            if (fileHandler.validateFile(inputFile)) {
                val text = fileHandler.readFile(inputFile) ?: return
                val brutText = caesarCipher.bruteForce(text)
                caesarCipher.writeBrutToFile(brutText, outputFile)
                println("Брут завершен.")
            }
            else {
                println("Ошибка: неверный путь к файлу.")
            }

        }
        4 -> println("Программа завершена.")
        else -> println("Неверный выбор.")
    }
}