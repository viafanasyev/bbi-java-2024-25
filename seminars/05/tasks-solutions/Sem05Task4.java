import java.util.Arrays;
import java.util.Scanner;

public class Sem05Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = parseArrayLength(scanner);
        if (length < 0) return;

        int[] array = parseArray(length, scanner);
        if (array == null) return;

        reverseInPlace(array);

        System.out.println("Развёрнутый массив: " + Arrays.toString(array));
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
                continue;
            }
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void reverseInPlace(int[] array) {
        for (int i = 0; i < array.length / 2; ++i) {
            // Попарно меняем элементы, симметричные относительно центра:
            //   Нулевой и последний
            //   Первый и предпоследний
            //   И т.д.
            swapAtIndices(array, i, array.length - i - 1);
        }
    }

    public static void swapAtIndices(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}