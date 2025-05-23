import java.util.Scanner;

public class Sem04ArrayTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = parseArrayLength(scanner);
        if (length < 0) return;

        int[] array = parseArray(length, scanner);
        if (array == null) return;

        double meanValue = mean(array);
        System.out.printf("Среднее арифметическое: %.6f%n", meanValue);
    }

    public static int parseArrayLength(Scanner scanner) {
        System.out.print("Введите длину массива: ");
        String lengthStr = scanner.nextLine().strip();
        if (!isCorrectInteger(lengthStr)) {
            System.out.println("Ошибка: не число");
            return -1;
        }
        int length = Integer.parseInt(lengthStr);
        if (length <= 0) {
            System.out.println("Ошибка: длина должна быть положительным числом");
            return -1;
        }
        return length;
    }

    public static int[] parseArray(int length, Scanner scanner) {
        int[] array = new int[length];
        System.out.print("Введите массив целых чисел (через пробел): ");
        String[] itemsStr = scanner.nextLine().strip().split(" ");
        if (itemsStr.length != array.length) {
            System.out.println("Ошибка: неправильное кол-во элементов. Ожидалось " + array.length + ", введено " + itemsStr.length);
            return null;
        }
        for (int i = 0; i < array.length; ++i) {
            String itemStr = itemsStr[i].strip();
            if (!isCorrectInteger(itemStr)) {
                System.out.println("Ошибка: не число по индексу " + i);
                return null;
            }
            array[i] = Integer.parseInt(itemStr);
        }
        return array;
    }

    public static boolean isCorrectInteger(String str) {
        str = str.strip();
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (i == 0 && (c == '-' || c == '+')) {
                // Знак '+' или '-' в начале числа - OK, положительное или отрицательное число
                continue;
            }
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static double mean(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        return sum;
    }
}