import java.io.File

class CaesarCipher {
    fun encrypt(text: String, key: Int): String {
        return caesarShift(text, key)
    }

    fun decrypt(text: String, key: Int): String {
        return caesarShift(text, -key)
    }

    private fun caesarShift(text: String, key: Int): String {
        val shiftedText = StringBuilder()
        for (char in text) {
            if (char.isLetter()) {
                val start = if (char.isLowerCase()) 'a'.code else 'A'.code
                val shiftedChar = (((char.code - start + key) % 26 + 26) % 26 + start).toChar()
                shiftedText.append(shiftedChar)
            }
            else {
                shiftedText.append(char)
            }
        }
        return shiftedText.toString()
    }

    fun bruteForce(ciphertext: String): List<String> {
        val possibleDecryptions = mutableListOf<String>()
        for (key in 1..25) {
            possibleDecryptions.add(decrypt(ciphertext, key))
        }
        return possibleDecryptions
    }

    fun writeBrutToFile(decryptions: List<String>, filename: String) {
        try {
            val sb = StringBuilder()
            for (i in decryptions.indices) {
                sb.append(decryptions[i])
                sb.append("\n\n")
            }
            File(filename).writeText(sb.toString())
        }
        catch (e: Exception) {
            println("Ошибка записи в файл: ${e.message}")
        }
    }

    fun validateKey(key: Int): Boolean {
        return key in 1..25
    }

}