import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    // 01. Функция для нахождения максимума
    public static int findMax(int num1, int num2) {
        if (num1 == num2) {
            throw new IllegalArgumentException("Числа равны, максимум не определить.");
        }
        else return Math.max(num1, num2);
    }

    // 02. Калькулятор деления
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        else {
            return dividend / divisor;
        }
    }

    // 03. Конвертер строк в числа
    public static int stringToInt(String str) {
        try {
            return Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            throw new NumberFormatException("Строка не может быть преобразована в целое число.");
        }
    }

    // 04. Проверка возраста
    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Недопустимый возраст.");
        }
    }

    // 05. Нахождение корня
    public static double findSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Корень из отрицательного числа не определен.");
        }
        else {
            return Math.sqrt(number);
        }
    }

    // 06. Факториал
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен.");
        }
        else if (number == 0) {
            return 1;
        }
        else {
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }

    // 07. Проверка массива на нули
    public static void checkArrayForZeroes(int[] array) {
        for (int num : array) {
            if (num == 0) {
                throw new IllegalArgumentException("Массив содержит нули.");
            }
        }
    }

    // 08. Калькулятор возведения в степень
    public static double power(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень должна быть положительной.");
        }
        else {
            return Math.pow(base, exponent);
        }
    }

    // 09. Обрезка строки
    public static String truncateString(String str, int maxLength) {
        if (maxLength > str.length()) {
            throw new IllegalArgumentException("Число символов больше длины строки.");
        }
        else {
            return str.substring(0, maxLength);
        }
    }

    // 10. Поиск элемента в массиве
    public static int findElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i; // Возвращаем индекс найденного элемента
            }
        }
        throw new IllegalArgumentException("Элемент не найден в массиве.");
    }

    // 11. Конвертация в двоичную систему
    public static String toBinary(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть положительным.");
        }
        else {
            return Integer.toBinaryString(number);
        }
    }

    // 12. Проверка делимости
    public static boolean isDivisible(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        else {
            return dividend % divisor == 0;
        }
    }

    // 13. Чтение элемента списка
    public static <T> T getElement(List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка.");
        }
        else {
            return list.get(index);
        }
    }

    // 14. Проверка пароля
    public static void checkPassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Пароль слишком короткий. Должен быть не менее 8 символов.");
        }
    }

    // 15. Проверка даты
    public static void checkDate(String dateString) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate.parse(dateString, formatter);
        }
        catch (DateTimeParseException e) {
            throw new DateTimeParseException("Неверный формат даты. Должен быть dd.MM.yyyy.", dateString, 0);
        }
    }

    // 16. Конкатенация строк
    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null.");
        }
        else {
            return str1 + str2;
        }
    }

    // 17. Остаток от деления
    public static int modulo(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        else {
            return dividend % divisor;
        }
    }

    // 18. Квадратный корень
    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть положительным.");
        }
        else {
            return Math.sqrt(number);
        }
    }

    // 19. Конвертер температуры
    public static double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) { // Абсолютный ноль
            throw new IllegalArgumentException("Температура не может быть меньше абсолютного нуля (-273.15).");
        }
        else {
            return (celsius * 9 / 5) + 32;
        }
    }

    // 20. Проверка строки на пустоту
    public static void checkStringNotEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка не может быть пустой или равной null.");
        }
    }

    // Определение исключения для слабого пароля
    public static class WeakPasswordException extends Exception {
        public WeakPasswordException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        //Task 01
        System.out.println("Задача 01");
        try {
            int max = findMax(10, 10);
            System.out.println("Максимум: " + max);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 02
        System.out.println("\nЗадача 02");
        try {
            double result = divide(10, 0);
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 03
        System.out.println("\nЗадача 03");
        try {
            int number = stringToInt("123qwewq");
            System.out.println("Преобразованное число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 04
        System.out.println("\nЗадача 04");
        try {
            checkAge(25);
            System.out.println("Возраст корректен.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 05
        System.out.println("\nЗадача 05");
        try {
            double root = findSquareRoot(16);
            System.out.println("Корень: " + root);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 06
        System.out.println("\nЗадача 06");
        try {
            long fact = factorial(5);
            System.out.println("Факториал: " + fact);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 07
        System.out.println("\nЗадача 07");
        try {
            int[] array = {1, 2, 3, 4, 5};
            checkArrayForZeroes(array);
            System.out.println("Массив не содержит нулей.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 08
        System.out.println("\nЗадача 08");
        try {
            double result = power(2, 3);
            System.out.println("Результат возведения в степень: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 09
        System.out.println("\nЗадача 09");
        try {
            String truncated = truncateString("Hello, world!", 5);
            System.out.println("Обрезанная строка: " + truncated);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 10
        System.out.println("\nЗадача 10");
        try {
            int[] array = {1, 2, 3, 4, 5};
            int index = findElement(array, 3);
            System.out.println("Индекс элемента: " + index);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 11
        System.out.println("\nЗадача 11");
        try {
            String binary = toBinary(-10);
            System.out.println("Двоичное представление: " + binary);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 12
        System.out.println("\nЗадача 12");
        try {
            boolean divisible = isDivisible(10, 2);
            System.out.println("Делится ли: " + divisible);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 13
        System.out.println("\nЗадача 13");
        try {
            List<String> names = new ArrayList<>(Arrays.asList("Женя", "Влад", "Света"));
            String name = getElement(names, 4);
            System.out.println("Имя: " + name);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 14
        System.out.println("\nЗадача 14");
        try {
            checkPassword("MyP");
            System.out.println("Пароль корректен.");
        } catch (WeakPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 15
        System.out.println("\nЗадача 15");
        try {
            checkDate("01.2024.02");
            System.out.println("Дата корректна.");
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 16
        System.out.println("\nЗадача 16");
        try {
            String result = concatenateStrings("Hello", null);
            System.out.println("Объединенная строка: " + result);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 17
        System.out.println("\nЗадача 17");
        try {
            int remainder = modulo(10, 0);
            System.out.println("Остаток от деления: " + remainder);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 18
        System.out.println("\nЗадача 18");
        try {
            double root = squareRoot(21);
            System.out.println("Квадратный корень: " + root);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 19
        System.out.println("\nЗадача 19");
        try {
            double fahrenheit = celsiusToFahrenheit(25);
            System.out.println("Температура в Фаренгейтах: " + fahrenheit);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 20
        System.out.println("\nЗадача 20");
        try {
            checkStringNotEmpty("Hello");
            System.out.println("Строка не пуста.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 20(a)
        System.out.println("\nЗадача 20(a)");
        try {
            checkStringNotEmpty(""); // Пустая строка
            System.out.println("Строка не пуста.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //Task 20(b)
        System.out.println("\nЗадача 20(b)");
        try {
            checkStringNotEmpty(null); // Null
            System.out.println("Строка не пуста.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }

}

