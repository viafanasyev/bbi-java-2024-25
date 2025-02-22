import java.util.Arrays;
import java.util.Scanner;

public class Sem05Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = parseArrayLength(scanner);
        if (length < 0) return;

        int[] array = parseArray(length, scanner);
        if (array == null) return;

        System.out.print("Массив без чисел, кратных 2: ");
        System.out.println(Arrays.toString(removeMultiples(array, 2)));

        System.out.print("Массив без чисел, кратных 3: ");
        System.out.println(Arrays.toString(removeMultiples(array, 3)));

        System.out.print("Массив без чисел, кратных 2 или 3: ");
        System.out.println(Arrays.toString(removeMultiples(removeMultiples(array, 2), 3)));
    }

    public static int parseArrayLength(Scanner scanner) {
        System.out.print("Введите длину массива: ");
        String lengthStr = scanner.nextLine().strip();
        if (!isCorrectInteger(lengthStr)) {
            System.out.println("Ошибка: не число");
            return -1;
        }
        int length = Integer.parseInt(lengthStr);
        if (length < 0) {
            System.out.println("Ошибка: длина должна быть неотрицательным числом");
            return -1;
        }
        return length;
    }

    public static int[] parseArray(int length, Scanner scanner) {
        if (length == 0) {
            return new int[0];
        }
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

    public static int[] removeMultiples(int[] array, int k) {
        int[] result = new int[array.length];
        int resultLength = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] % k != 0) {
                result[resultLength] = array[i];
                ++resultLength;
            }
        }
        return Arrays.copyOf(result, resultLength);
    }
}