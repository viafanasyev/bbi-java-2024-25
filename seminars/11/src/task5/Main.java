package task5;

import java.util.Scanner;

public class Main {
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

        for (int i = 0; i < yearAsString.length(); ++i) {
            if (!Character.isDigit(yearAsString.charAt(i))) {
                System.out.println("Ошибка: не число");
                return;
            }
        }

        if (yearAsString.isEmpty() || yearAsString.length() > 4) {
            System.out.println("Ошибка: некорректный год");
            return;
        }

        int year = Integer.parseInt(yearAsString);

        if (year > 2025) {
            System.out.println("Ошибка: некорректный год");
            return;
        }

        int age = 2025 - year;
        System.out.println(name + ", 31 декабря 2025 года вам будет " + age + " лет");

        int sum = 0;
        for (int i = year; i <= 2025; ++i) {
            sum += i;
        }
        System.out.println("Сумма чисел от " + year + " до 2025 равна " + sum);
    }
}
