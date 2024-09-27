//Task 01
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

//Task 02
fun findMin(a: Int, b: Int, c: Int): Int {
    return minOf(a, minOf(b, c))
}

//Task 03
fun multiplicationTable(number: Int) {
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}

//Task 04
fun sumNumbers(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}

//Task 05
fun fibonacciSequence(n: Int) {
    var a = 0
    var b = 1
    for (i in 1..n) {
        println(a)
        val temp = a
        a = b
        b = temp + b
    }
}

//Task 06
fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

//Task 07
fun reverseNumbers(n: Int) {
    for (i in n downTo 1) {
        println(i)
    }
}

//Task 08
fun sumEvenNumbers(a: Int, b: Int): Int {
    var sum = 0
    for (i in a..b) {
        if (i % 2 == 0) {
            sum += i
        }
    }
    return sum
}

//Task 09
fun reverseString(str: String): String {
    return str.reversed()
}

//Task 10
fun countDigits(number: Int): Int {
    return if (number == 0) {
        1
    } else {
        Math.log10(number.toDouble()).toInt() + 1
    }
}

//Task 11
fun factorial(n: Int): Long {
    if (n < 0) {
        return -1 // or throw an exception
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

//Task 12
fun sumDigits(number: Int): Int {
    var sum = 0
    var num = number
    while (num > 0) {
        sum += num % 10
        num /= 10
    }
    return sum
}

//Task 13
fun isPalindrome(str: String): Boolean {
    val cleanedStr = str.lowercase().replace("[^a-zA-Z0-9]".toRegex(), "")
    return cleanedStr == cleanedStr.reversed()
}

//Task 14
fun findMax(array: IntArray): Int {
    if (array.isEmpty()) {
        return Int.MIN_VALUE
    } else {
        var max = array[0]
        for (i in 1 until array.size) {
            if (array[i] > max) {
                max = array[i]
            }
        }
        return max
    }
}

//Task 15
fun sumArrayElements(array: IntArray): Int {
    var sum = 0
    for (element in array) {
        sum += element
    }
    return sum
}

//Task 16
fun countPositivesAndNegatives(array: IntArray): Pair<Int, Int> {
    var positiveCount = 0
    var negativeCount = 0
    for (element in array) {
        if (element > 0) {
            positiveCount++
        } else if (element < 0) {
            negativeCount++
        }
    }
    return Pair(positiveCount, negativeCount)
}

//Task 17
fun printPrimesInRange(a: Int, b: Int) {
    for (number in a..b) {
        if (isPrime(number)) {
            println(number)
        }
    }
}

//Task 18
fun countVowelsAndConsonants(str: String): Pair<Int, Int> {
    val vowels = "aeiouAEIOU"
    var vowelCount = 0
    var consonantCount = 0
    for (char in str) {
        if (vowels.contains(char)) {
            vowelCount++
        } else if (char.isLetter()) {
            consonantCount++
        }
    }
    return Pair(vowelCount, consonantCount)
}

//Task 19
fun reverseWords(str: String): String {
    return str.split(" ").reversed().joinToString(" ")
}

//Task 20
fun isArmstrongNumber(number: Int): Boolean {
    val digits = number.toString().length
    var sum = 0
    var num = number
    while (num > 0) {
        val digit = num % 10
        sum += Math.pow(digit.toDouble(), digits.toDouble()).toInt()
        num /= 10
    }
    return sum == number
}

fun main() {

    println("Выберите задачу (1-20):")
    val taskNumber = readLine()?.toIntOrNull() ?: 0

    when (taskNumber) {
        1 -> {
            println("Введите целое число:")
            val number = readLine()?.toIntOrNull() ?: 0
            if (isEven(number)) {
                println("Число четное.")
            } else {
                println("Число нечетное.")
            }
        }

        2 -> {
            println("Введите три целых числа:")
            val a = readLine()?.toIntOrNull() ?: 0
            val b = readLine()?.toIntOrNull() ?: 0
            val c = readLine()?.toIntOrNull() ?: 0
            println("Минимальное число: ${findMin(a, b, c)}")
        }

        3 -> {
            println("Введите целое число:")
            val number = readLine()?.toIntOrNull() ?: 0
            multiplicationTable(number)
        }

        4 -> {
            println("Введите целое число N:")
            val n = readLine()?.toIntOrNull() ?: 0
            println("Сумма чисел от 1 до $n: ${sumNumbers(n)}")
        }

        5 -> {
            println("Введите целое число N:")
            val n = readLine()?.toIntOrNull() ?: 0
            println("Первые $n чисел Фибоначчи:")
            fibonacciSequence(n)
        }

        6 -> {
            println("Введите целое число:")
            val number = readLine()?.toIntOrNull() ?: 0
            if (isPrime(number)) {
                println("Число простое.")
            } else {
                println("Число не простое.")
            }
        }

        7 -> {
            println("Введите целое число N:")
            val n = readLine()?.toIntOrNull() ?: 0
            println("Числа от $n до 1 в обратном порядке:")
            reverseNumbers(n)
        }

        8 -> {
            println("Введите два целых числа A и B:")
            val a = readLine()?.toIntOrNull() ?: 0
            val b = readLine()?.toIntOrNull() ?: 0
            println("Сумма четных чисел от $a до $b: ${sumEvenNumbers(a, b)}")
        }

        9 -> {
            println("Введите строку:")
            val str = readLine() ?: ""
            println("Строка в обратном порядке: ${reverseString(str)}")
        }

        10 -> {
            println("Введите целое число:")
            val number = readLine()?.toIntOrNull() ?: 0
            println("Количество цифр в числе: ${countDigits(number)}")
        }

        11 -> {
            println("Введите целое число N:")
            val n = readLine()?.toIntOrNull() ?: 0
            println("Факториал $n: ${factorial(n)}")
        }

        12 -> {
            println("Введите целое число:")
            val number = readLine()?.toIntOrNull() ?: 0
            println("Сумма цифр числа: ${sumDigits(number)}")
        }

        13 -> {
            println("Введите строку:")
            val str = readLine() ?: ""
            if (isPalindrome(str)) {
                println("Строка является палиндромом.")
            } else {
                println("Строка не является палиндромом.")
            }
        }

        14 -> {
            println("Введите размер массива:")
            val size = readLine()?.toIntOrNull() ?: 0
            println("Введите элементы массива:")
            val array = IntArray(size) { readLine()?.toIntOrNull() ?: 0 }
            println("Максимальное число в массиве: ${findMax(array)}")
        }

        15 -> {
            println("Введите размер массива:")
            val size = readLine()?.toIntOrNull() ?: 0
            println("Введите элементы массива:")
            val array = IntArray(size) { readLine()?.toIntOrNull() ?: 0 }
            println("Сумма элементов массива: ${sumArrayElements(array)}")
        }

        16 -> {
            println("Введите размер массива:")
            val size = readLine()?.toIntOrNull() ?: 0
            println("Введите элементы массива:")
            val array = IntArray(size) { readLine()?.toIntOrNull() ?: 0 }
            val (positiveCount, negativeCount) = countPositivesAndNegatives(array)
            println("Положительных чисел: $positiveCount, Отрицательных чисел: $negativeCount")
        }

        17 -> {
            println("Введите два целых числа A и B:")
            val a = readLine()?.toIntOrNull() ?: 0
            val b = readLine()?.toIntOrNull() ?: 0
            println("Простые числа в диапазоне от $a до $b:")
            printPrimesInRange(a, b)
        }

        18 -> {
            println("Введите строку:")
            val str = readLine() ?: ""
            val (vowelCount, consonantCount) = countVowelsAndConsonants(str)
            println("Гласных: $vowelCount, Согласных: $consonantCount")
        }

        19 -> {
            println("Введите строку:")
            val str = readLine() ?: ""
            println("Переставленная строка: ${reverseWords(str)}")
        }

        20 -> {
            println("Введите целое число:")
            val number = readLine()?.toIntOrNull() ?: 0
            if (isArmstrongNumber(number)) {
                println("Число является числом Армстронга.")
            } else {
                println("Число не является числом Армстронга.")
            }
        }

        else -> {
            println("Некорректный номер задачи.")
        }
    }
}