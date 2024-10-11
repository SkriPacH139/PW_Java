import java.io.File
import java.io.IOException

class FileHandler {
    fun readFile(filePath: String): String? {
        val file = File(filePath)
        if (!file.exists()) {
            println("Ошибка: файл не найден.")
            return null
        }
        return try {
            file.readText()
        }
        catch (e: IOException) {
            println("Ошибка чтения файла: ${e.message}")
            null
        }
    }

    fun writeFile(filePath: String, text: String) {
        val file = File(filePath)
        try {
            file.writeText(text)
        }
        catch (e: IOException) {
            println("Ошибка записи в файл: ${e.message}")
        }
    }

    fun validateFile(filePath: String): Boolean {
        return File(filePath).exists()
    }

}