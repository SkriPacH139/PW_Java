import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Задача 1: Четное или нечетное число
    public static void checkEvenOdd(int num) {
        System.out.println(num + " - " + (num % 2 == 0 ? "Четное число" : "Нечетное число"));
    }

    // Задача 2: Минимальное из трех чисел
    public static void findMin(int num1, int num2, int num3) {
        int min = Math.min(num1, num2);

        min = Math.min(min, num3);

        System.out.println("Минимальное число: " + min);
    }

    // Задача 3: Таблица умножения
    public static void multiplicationTable() {
        int num = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // Задача 4: Сумма чисел от 1 до N
    public static void sumOfNumbers(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Сумма чисел от 1 до " + num + ": " + sum);
    }

    // Задача 5: Число Фибоначчи
    public static void fibonacciSequence(int n) {
        int a = 0;
        int b = 1;
        int temp;

        System.out.print("Первые " + n + " чисел Фибоначчи: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            temp = a;
            a = b;
            b = temp + b;
        }

        System.out.println();
    }

    // Задача 6: Проверка простого числа
    public static void checkPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " - не простое число");
            return;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " - не простое число");
                return;
            }
        }

        System.out.println(num + " - простое число");
    }

    // Задача 7: Обратный порядок числа
    public static void reverseNumbers(int num) {
        System.out.print("Число " + num + " в обратном порядке: ");

        System.out.println(new StringBuilder(Integer.toString(num)).reverse().toString());
    }

    // Задача 8: Сумма четных чисел
    public static void sumOfEvenNumbers(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Сумма четных чисел в диапазоне от " + a + " до " + b + ": " + sum);
    }

    // Задача 9: Реверс строки
    public static void reverseString(String str) {
        String reversedString = new StringBuilder(str).reverse().toString();

        System.out.println("Обратная строка: " + reversedString);
    }

    // Задача 10: Количество цифр в числе
    public static void countDigits(int num) {
        int count = 0;

        if (num == 0) {
            count = 1; // Обработка случая, когда число равно 0
        }

        else {
            while (num != 0) {
                num /= 10;
                count++;
            }
        }

        System.out.println("Количество цифр в числе: " + count);
    }

    // Задача 11: Факториал числа
    public static void factorial(int num) {
        if (num < 0) {

            System.out.println("Факториал не определен для отрицательных чисел.");

            return;
        }

        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= num; i++) {

            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Факториал " + num + "! равен: " + factorial);
    }

    // Задача 12: Сумма цифр числа
    public static void sumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {

            sum += num % 10;

            num /= 10;
        }
        System.out.println("Сумма цифр числа: " + sum);
    }

    // Задача 13: Палиндром
    public static void checkPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s", "");

        int left = 0;

        int right = str.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome ? "Строка является палиндромом." : "Строка не является палиндромом.");

    }

    // Задача 14: Найти максимальное число в массиве
    public static void findMax(int[] array) {
        if (array.length == 0) {

            System.out.println("Массив пуст.");
            return;
        }

        System.out.println("Максимальное число в массиве: " + Arrays.stream(array).max().getAsInt());
    }

    // Задача 15: Сумма всех элементов массива
    public static void sumOfArray(int[] array) {
        if (array.length == 0) {

            System.out.println("Массив пуст.");
            return;
        }

        System.out.println("Сумма всех элементов массива: " +  Arrays.stream(array).sum());
    }

    // Задача 16: Количество положительных и отрицательных чисел
    public static void countPositiveNegative(int[] array) {
        int positiveCount = 0;

        int negativeCount = 0;

        for (int j : array) {
            if (j > 0) {
                positiveCount++;
            }
            else if (j < 0) {
                negativeCount++;
            }
        }

        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
    }

    // Задача 17: Простые числа в диапазоне
    public static void printPrimes(int num1, int num2) {
        if (num1<2 && num2<2 ) {
            System.out.println("Простых чисел нет!" );
            return;
        }

        if (num1 < 2) {
            num1 = 2; // Начинаем с 2, так как 1 не простое число
        }

        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Задача 18: Подсчет гласных и согласных в строке
    public static void countVowelsConsonants(String str) {
        str = str.toLowerCase();

        int vowelCount = 0;

        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y' ||
                        ch == 'а' || ch == 'о' || ch == 'е' || ch == 'ё' || ch == 'и' ||
                        ch == 'ю' || ch == 'у' || ch == 'э' || ch == 'ы' || ch == 'я' ) {
                    vowelCount++;
                }
                else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Количество гласных: " + vowelCount);
        System.out.println("Количество согласных: " + consonantCount);
    }

    // Задача 19: Перестановка слов в строке
    public static void reverseWords(String str) {
        String[] words = str.split(" ");

        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }

        System.out.println(reversedString.toString().trim());
    }

    // Задача 20: Число Армстронга
    public static void checkArmstrong(int num) {
        int originalNum = num;

        int digitsCount = 0;

        int sum = 0;

        // Подсчет количества цифр
        while (num > 0) {
            digitsCount++;
            num /= 10;
        }

        num = originalNum; // Восстановление исходного числа

        // Вычисление суммы цифр в степени
        while (num > 0) {

            int digit = num % 10;

            sum += (int) Math.pow(digit, digitsCount);

            num /= 10;
        }

        System.out.println(sum==originalNum ? (originalNum + " - число Армстронга.") : (originalNum + " - не число Армстронга."));
    }

    public static void  task_01(Scanner scanner){   // Задача 1: Четное или нечетное число
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 1: Четное или нечетное число");
        System.out.print("Введите число: ");

        String num;

        while (true) {
            num = checkForDigit(scanner.nextLine());
            if (num.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        checkEvenOdd(Integer.parseInt(num));
    }

    public static void  task_02(Scanner scanner){  // Задача 2: Минимальное из трех чисел
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 2: Минимальное из трех чисел");
        System.out.print("Введите первое число: ");

        String num1, num2, num3;

        while (true) {
            num1 = checkForDigit(scanner.nextLine());
            if (num1.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        System.out.print("Введите второе число: ");
        while (true) {
            num2 = checkForDigit(scanner.nextLine());
            if (num2.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        System.out.print("Введите третье число: ");
        while (true) {
            num3 = checkForDigit(scanner.nextLine());
            if (num3.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        findMin(Integer.parseInt(num1), Integer.parseInt(num2), Integer.parseInt(num3));
    }

    public static void  task_03(Scanner scanner){  // Задача 3: Таблица умножения
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 3: Таблица умножения");

        multiplicationTable();
    }

    public static void  task_04(Scanner scanner){ // Задача 4: Сумма чисел от 1 до N
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 4: Сумма чисел от 1 до N");
        System.out.print("Введите число N: ");

        String num;

        while (true) {
            num = checkForDigit(scanner.nextLine());
            if (num.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        sumOfNumbers(Integer.parseInt(num));
    }

    public static void  task_05(Scanner scanner){  // Задача 5: Число Фибоначчи
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 5: Число Фибоначчи");
        System.out.print("Введите количество чисел Фибоначчи: ");

        String num;

        while (true) {
            num = checkForDigit(scanner.nextLine());
            if (num.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        fibonacciSequence(Integer.parseInt(num));
    }

    public static void  task_06(Scanner scanner){   // Задача 6: Проверка простого числа
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 6: Проверка простого числа");
        System.out.print("Введите число: ");

        String num;

        while (true) {
            num = checkForDigit(scanner.nextLine());
            if (num.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        checkPrime(Integer.parseInt(num));
    }

    public static void  task_07(Scanner scanner){ // Задача 7: Обратный порядок чисел
        scanner = new Scanner(System.in);
        System.out.println("\nЗадача 7: Обратный порядок чисел");
        System.out.print("Введите число: ");

        String num;

        while (true) {
            num = checkForDigit(scanner.nextLine());
            if (num.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        reverseNumbers(Integer.parseInt(num));
    }

    public static void  task_08(Scanner scanner){  // Задача 8: Сумма четных чисел
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 8: Сумма четных чисел");
        System.out.print("Введите первое число: ");

        String num1, num2;

        while (true) {
            num1 = checkForDigit(scanner.nextLine());
            if (num1.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        System.out.print("Введите второе число: ");
        while (true) {
            num2 = checkForDigit(scanner.nextLine());
            if (num2.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        sumOfEvenNumbers(Integer.parseInt(num1), Integer.parseInt(num2));
    }

    public static void  task_09(Scanner scanner){ // Задача 9: Реверс строки
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 9: Реверс строки");
        System.out.print("Введите строку: ");

        String str = scanner.nextLine();

        reverseString(str);
    }

    public static void  task_10(Scanner scanner){ // Задача 10: Количество цифр в числе
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 10: Количество цифр в числе");
        System.out.print("Введите число: ");

        String num;

        while (true) {
            num = checkForDigit(scanner.nextLine());
            if (num.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        countDigits(Integer.parseInt(num));
    }

    public static void  task_11(Scanner scanner){ // Задача 11: Факториал числа
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 11: Факториал числа");
        System.out.print("Введите число: ");

        String num;

        while (true) {
            num = checkForDigit(scanner.nextLine());
            if (num.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        factorial(Integer.parseInt(num));
    }

    public static void  task_12(Scanner scanner){ // Задача 12: Сумма цифр числа
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 12: Сумма цифр числа");
        System.out.print("Введите число: ");

        String num;

        while (true) {
            num = checkForDigit(scanner.nextLine());
            if (num.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        sumOfDigits(Integer.parseInt(num));
    }

    public static void  task_13(Scanner scanner){ // Задача 13: Палиндром
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 13: Палиндром");
        System.out.print("Введите строку: ");

        String str = scanner.nextLine();
        checkPalindrome(str);
    }

    public static void  task_14(Scanner scanner){ // Задача 14: Найти максимальное число в массиве
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 14: Найти максимальное число в массиве");
        System.out.print("Введите размер массива: ");

        String size;

        while (true) {
            size = checkForDigit(scanner.nextLine());
            if (size.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                size = size.replaceAll("[^0-9]", "");
                break;
            }
        }

        int[] array = new int[Integer.parseInt(size)];

        System.out.println("Введите элементы массива:");

        String num;

        for (int i = 0; i < Integer.parseInt(size); i++) {

            while (true) {
                num = checkForDigit(scanner.nextLine());
                if (num.isEmpty()) {
                    System.out.println("Введено не число!! Введите число заного: ");
                } else {
                    break;
                }
            }

            array[i] = Integer.parseInt(num);

        }

        findMax(array);
    }

    public static void  task_15(Scanner scanner){  // Задача 15: Сумма всех элементов массива
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 15: Сумма всех элементов массива");
        System.out.print("Введите размер массива: ");

        String size;

        while (true) {
            size = checkForDigit(scanner.nextLine());
            if (size.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                size = size.replaceAll("[^0-9]", "");
                break;
            }
        }

        int[] array = new int[Integer.parseInt(size)];

        System.out.println("Введите элементы массива:");

        String num;

        for (int i = 0; i < Integer.parseInt(size); i++) {

            while (true) {
                num = checkForDigit(scanner.nextLine());
                if (num.isEmpty()) {
                    System.out.println("Введено не число!! Введите число заного: ");
                } else {
                    break;
                }
            }

            array[i] = Integer.parseInt(num);

        }

        sumOfArray(array);
    }

    public static void  task_16(Scanner scanner){  // Задача 16: Количество положительных и отрицательных чисел
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 16: Количество положительных и отрицательных чисел");
        System.out.print("Введите размер массива: ");

        String size;

        while (true) {
            size = checkForDigit(scanner.nextLine());
            if (size.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                size = size.replaceAll("[^0-9]", "");
                break;
            }
        }

        int[] array = new int[Integer.parseInt(size)];

        System.out.println("Введите элементы массива:");

        String num;

        for (int i = 0; i < Integer.parseInt(size); i++) {

            while (true) {
                num = checkForDigit(scanner.nextLine());
                if (num.isEmpty()) {
                    System.out.println("Введено не число!! Введите число заного: ");
                } else {
                    break;
                }
            }

            array[i] = Integer.parseInt(num);

        }

        countPositiveNegative(array);
    }

    public static void  task_17(Scanner scanner){ // Задача 17: Простые числа в диапазоне
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 17: Простые числа в диапазоне");
        System.out.print("Введите первое число: ");

        String num1, num2;

        while (true) {
            num1 = checkForDigit(scanner.nextLine());
            if (num1.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        System.out.print("Введите второе число: ");
        while (true) {
            num2 = checkForDigit(scanner.nextLine());
            if (num2.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        printPrimes(Integer.parseInt(num1), Integer.parseInt(num2));
    }

    public static void  task_18( Scanner scanner){  // Задача 18: Подсчет гласных и согласных в строке
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 18: Подсчет гласных и согласных в строке");
        System.out.print("Введите строку: ");

        String str = scanner.nextLine();

        countVowelsConsonants(str);
    }

    public static void  task_19(Scanner scanner){  // Задача 19: Перестановка слов в строке
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 19: Перестановка слов в строке");
        System.out.print("Введите строку: ");

        String str = scanner.nextLine();

        reverseWords(str);
    }

    public static void  task_20(Scanner scanner){   // Задача 20: Число Армстронга
        scanner = new Scanner(System.in);

        System.out.println("\nЗадача 20: Число Армстронга");
        System.out.print("Введите целое число: ");

        String num;

        while (true) {
            num = checkForDigit(scanner.nextLine());
            if (num.isEmpty()) {
                System.out.println("Введено не число!! Введите число заного: ");
            }
            else {
                break;
            }
        }

        checkArmstrong(Integer.parseInt(num));
    }

    public static String checkForDigit(String str){
        String digit = "";
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0) == '-' && count==0) {
                digit+=str.charAt(i);
                count++;
            }

            else {
                if(Character.isDigit(str.charAt(i))){
                    digit += str.charAt(i);
                }
            }

        }

        digit = digit.isEmpty() ? "" : digit;

        return digit;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        task_01(scanner);
        task_02(scanner);
        task_03(scanner);
        task_04(scanner);
        task_05(scanner);
        task_06(scanner);
        task_07(scanner);
        task_08(scanner);
        task_09(scanner);
        task_10(scanner);
        task_11(scanner);
        task_12(scanner);
        task_13(scanner);
        task_14(scanner);
        task_15(scanner);
        task_16(scanner);
        task_17(scanner);
        task_18(scanner);
        task_19(scanner);
        task_20(scanner);

        scanner.close();
    }
}