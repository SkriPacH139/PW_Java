import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

//Task 01
fun findMax(a: Int, b: Int): Int {
    if (a == b) {
        throw IllegalArgumentException("Числа равны, максимум определить невозможно.")
    }
    return if (a > b) a else b
}

//Task 02
fun divide(dividend: Int, divisor: Int): Int {
    if (divisor == 0) {
        throw ArithmeticException("Деление на ноль не допускается.")
    }
    return dividend / divisor
}

//Task 03
fun stringToInt(str: String): Int {
    try {
        return str.toInt()
    }
    catch (e: NumberFormatException) {
        throw NumberFormatException("Строку невозможно преобразовать в целое число: $str")
    }
}

//Task 04
fun checkAge(age: Int) {
    if (age < 0 || age > 150) {
        throw IllegalArgumentException("Неверный возраст: $age. Возраст должен быть от 0 до 150.")
    }
}

//Task 05
fun findSquareRoot(number: Double): Double {
    if (number < 0) {
        throw IllegalArgumentException("Не могу найти квадратный корень из отрицательного числа: $number")
    }
    return Math.sqrt(number)
}

//Task 06
fun factorial(n: Int): Long {
    if (n < 0) {
        throw IllegalArgumentException("Невозможно вычислить факториал отрицательного числа: $n")
    } else if (n == 0) {
        return 1
    } else {
        var result = 1L
        for (i in 1..n) {
            result *= i
        }
        return result
    }
}

//Task 07
fun checkForZero(array: IntArray) {
    if (array.contains(0)) {
        throw IllegalArgumentException("Массив содержит ноли.")
    }
}

//Task 08
fun power(base: Int, exponent: Int): Int {
    if (exponent < 0) {
        throw IllegalArgumentException("Показатель не может быть отрицательным: $exponent")
    }
    return Math.pow(base.toDouble(), exponent.toDouble()).toInt()
}

//Task 09
fun truncateString(str: String, maxLength: Int): String {
    if (maxLength > str.length) {
        throw IllegalArgumentException("Макс. длина не может быть больше длины строки.")
    }
    return str.substring(0, maxLength)
}

//Task 10
fun findElement(array: IntArray, element: Int): Int {
    for (i in array.indices) {
        if (array[i] == element) {
            return i
        }
    }
    throw NoSuchElementException("Элемент $element не найден в массиве.")
}

//Task 11
fun toBinaryString(number: Int): String {
    if (number < 0) {
        throw IllegalArgumentException("Невозможно преобразовать отрицательное число в двоичное: $number")
    }
    return Integer.toBinaryString(number)
}

//Task 12
fun isDivisible(dividend: Int, divisor: Int): Boolean {
    if (divisor == 0) {
        throw ArithmeticException("Деление на ноль не допускается..")
    }
    return dividend % divisor == 0
}

//Task 13
fun getElement(list: List<Any>, index: Int): Any {
    if (index < 0 || index >= list.size) {
        throw IndexOutOfBoundsException("Индекс $index находится за пределами списка.")
    }
    return list[index]
}

//Task 14
fun checkPassword(password: String) {
    if (password.length < 8) {
        throw WeakPasswordException("Пароль должен быть длиной не менее 8 символов.")
    }
}

class WeakPasswordException(message: String) : Exception(message)

//Task 15
fun isValidDate(dateString: String) {
    try {
        LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"))
    }
    catch (e: DateTimeParseException) {
        throw DateTimeParseException("Неверный формат даты: $dateString. Ожидаемый формат dd.MM.yyyy.", dateString, 0)
    }
}

//Task 16
fun concatenateStrings(str1: String, str2: String): String {
    if (str1 == null || str2 == null) {
        throw NullPointerException("Одна из строк имеет значение null.")
    }
    return str1 + str2
}

//Task 17
fun getRemainder(dividend: Int, divisor: Int): Int {
    if (divisor == 0) {
        throw ArithmeticException("Деление на ноль не допускается..")
    }
    return dividend % divisor
}

//Task 18
fun celsiusToFahrenheit(celsius: Double): Double {
    if (celsius < -273.15) {
        throw IllegalArgumentException("Температура не может быть ниже абсолютного нуля (-273.15): $celsius")
    }
    return (celsius * 9 / 5) + 32
}

//Task 19
fun checkEmptyString(str: String) {
    if (str.isEmpty() || str == null) {
        throw IllegalArgumentException("Строка пуста или равна нулю.")
    }
}


fun main() {
    println("Выберите задачу (1-19):")
    val taskNumber = readLine()?.toIntOrNull() ?: 0

    when (taskNumber) {
        1 -> {
            println("Введите два целых числа:")
            val a = readLine()?.toIntOrNull() ?: 0
            val b = readLine()?.toIntOrNull() ?: 0
            try {
                println("Максимальное число: ${findMax(a,b)}")
            }
            catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
        2 -> {
            println("Введите делимое и делитель:")
            val dividend = readLine()?.toIntOrNull() ?: 0
            val divisor = readLine()?.toIntOrNull() ?: 0
            try {
                println("Результат деления: ${divide(dividend,divisor)}")
            }
            catch (e: ArithmeticException) {
                println(e.message)
            }
        }
        3 -> {
            println("Введите строку:")
            val str = readLine() ?: ""
            try {
                println("Число: ${stringToInt(str)}")
            }
            catch (e: NumberFormatException) {
                println(e.message)
            }
        }
        4 -> {
            println("Введите возраст:")
            val age = readLine()?.toIntOrNull() ?: 0
            try {
                checkAge(age)
                println("Возраст корректен.")
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
        5 -> {
            println("Введите число:")
            val number = readLine()?.toDoubleOrNull() ?: 0.0
            try {
                val sqrt = Math.sqrt(number)
                println("Квадратный корень: ${findSquareRoot(sqrt)}")
            }
            catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
        6 -> {
            println("Введите целое число:")
            val n = readLine()?.toIntOrNull() ?: 0
            try {
                    println("Факториал $n: ${factorial(n)}")
            }
            catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
        7 -> {
            println("Введите элементы массива через пробел:")
            val input = readLine() ?: ""
            val numbers = input.split(" ").map { it.toIntOrNull() ?: 0 }.toIntArray()
            try {
                checkForZero(numbers)
                println("Массив не содержит нолей.")
            }
            catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
        8 -> {
            println("Введите основание и показатель степени:")
            val base = readLine()?.toIntOrNull() ?: 0
            val exponent = readLine()?.toIntOrNull() ?: 0
            try {
                println("Результат возведения в степень: ${power(base, exponent)}")
            }
            catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
        9 -> {
            println("Введите строку и максимальную длину:")
            val str = readLine() ?: ""
            val maxLength = readLine()?.toIntOrNull() ?: 0
            try {
                println("Усеченная строка: ${truncateString(str,maxLength)}")
            }
            catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
        10 -> {
            println("Введите элементы массива через пробел:")
            val input = readLine() ?: ""
            val numbers = input.split(" ").map { it.toIntOrNull() ?: 0 }.toIntArray()
            println("Введите элемент для поиска:")
            val element = readLine()?.toIntOrNull() ?: 0
            try {
                println("Индекс элемента: ${findElement(numbers,element)}")
            }
            catch (e: NoSuchElementException) {
                println(e.message)
            }
        }
        11 -> {
            println("Введите целое число:")
            val number = readLine()?.toIntOrNull() ?: 0
            try {
               println("Двоичное представление: ${toBinaryString(number)}")
            }
            catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
        12 -> {
            println("Введите делимое и делитель:")
            val dividend = readLine()?.toIntOrNull() ?: 0
            val divisor = readLine()?.toIntOrNull() ?: 0
            try {
                println("Делится ли без остатка: ${isDivisible(dividend, divisor)}")
            }
            catch (e: ArithmeticException) {
                println(e.message)
            }
        }
        13 -> {
            println("Введите элементы списка через пробел:")
            val input = readLine() ?: ""
            val list = input.split(" ").toList()
            println("Введите индекс элемента:")
            val index = readLine()?.toIntOrNull() ?: 0
            try {
                println("Элемент: ${getElement(list, index)}")
            }
            catch (e: IndexOutOfBoundsException) {
                println(e.message)
            }
        }
        14 -> {
            println("Введите пароль:")
            val password = readLine() ?: ""
            try {
                checkPassword(password)
                println("Пароль корректен.")
            }
            catch (e: WeakPasswordException) {
                println(e.message)
            }
        }
        15 -> {
            println("Введите дату в формате dd.MM.yyyy:")
            val dateString = readLine() ?: ""
            isValidDate(dateString)
        }
        16 -> {
            println("Введите две строки:")
            val str1 = readLine() ?: ""
            val str2 = readLine() ?: ""
            try {
                println("Собъединенная строка: ${concatenateStrings(str1,str2)}")
            }
            catch (e: NullPointerException) {
                println(e.message)
            }
        }
        17 -> {
            println("Введите делимое и делитель:")
            val dividend = readLine()?.toIntOrNull() ?: 0
            val divisor = readLine()?.toIntOrNull() ?: 0
            try {
                println("Остаток от деления: ${getRemainder(dividend,divisor)}")
            }
            catch (e: ArithmeticException) {
                println(e.message)
            }
        }
        18 -> {
            println("Введите температуру в градусах Цельсия:")
            val celsius = readLine()?.toDoubleOrNull() ?: 0.0
            try {
                println("Температура в градусах Фаренгейта: ${celsiusToFahrenheit(celsius)}")
            }
            catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
        19 -> {
            println("Введите строку:")
            val str = readLine() ?: ""
            try {
                checkEmptyString(str)
                println("Строка не пуста.")
            }
            catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
        else -> {
            println("Некорректный номер задачи.")
        }
    }
}