package task5;

import java.util.Scanner;

/*
   Чтобы протестировать методы, которые работают с вводом-выводом, необходимо привести их в "чистую" форму:
      Методы не должны ничего считывать с клавиатуры и ничего печатать.
   Такие методы можно вызвать в unit-тестах, получить результат и проверить его.

   Оригинальный класс Main изменён, чтобы можно было протестировать наиболее сложные части из его кода.
   В main остался код, который только считывает данные и выводит что-то в ответ.
*/
public class MainFixed {
    private static final int CURRENT_YEAR = 2025;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        if (name.isBlank()) {
            System.out.println("Ошибка: имя не может быть пустым");
            return;
        }

        System.out.print("Введите ваш год рождения: ");
        String yearAsString = scanner.nextLine();

        int year = parseYear(yearAsString);
        if (year == -1) {
            System.out.println("Ошибка: некорректный год");
            return;
        }

        int age = getAge(year);
        System.out.println(name + ", 31 декабря " + CURRENT_YEAR + " года вам будет " + age + " лет");

        int sum = getSum(year);
        System.out.println("Сумма чисел от " + year + " до " + CURRENT_YEAR + " равна " + sum);
    }

    public static int parseYear(String yearAsString) {
        for (int i = 0; i < yearAsString.length(); ++i) {
            if (!Character.isDigit(yearAsString.charAt(i))) {
                return -1;
            }
        }

        if (yearAsString.isEmpty() || yearAsString.length() > 4) {
            return -1;
        }

        int year = Integer.parseInt(yearAsString);

        if (year > CURRENT_YEAR) {
            return -1;
        }
        return year;
    }

    public static int getAge(int year) {
        return CURRENT_YEAR - year;
    }

    public static int getSum(int year) {
        int sum = 0;
        for (int i = year; i <= CURRENT_YEAR; ++i) {
            sum += i;
        }
        return sum;
    }
}
