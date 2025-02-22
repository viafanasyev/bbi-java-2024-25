import java.util.Arrays;
import java.util.Scanner;

public class Sem04ArrayTask9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = parseArrayLength(scanner);
        if (length < 0) return;

        int[] array = parseArray(length, scanner);
        if (array == null) return;

        int k = parsePositiveInteger(scanner);
        if (k < 0) return;

        int[] kFirst = takeFirst(array, k);
        int[] kLast = takeLast(array, k);
        System.out.println(Arrays.toString(kFirst));
        System.out.println(Arrays.toString(kLast));
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

    public static int parsePositiveInteger(Scanner scanner) {
        System.out.print("Введите положительное целое число: ");
        String positiveIntStr = scanner.nextLine();
        if (!isCorrectInteger(positiveIntStr)) {
            System.out.println("Ошибка: не число");
            return -1;
        }
        int positiveInt = Integer.parseInt(positiveIntStr);
        if (positiveInt <= 0) {
            System.out.println("Ошибка: должно вводиться положительное число");
            return -1;
        }
        return positiveInt;
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

    public static int[] takeFirst(int[] array, int k) {
        if (k > array.length) {
            // Будем считать, что при очень большом K берётся весь массив
            k = array.length;
        }

        int[] result = new int[k];
        for (int i = 0; i < k; ++i) {
            result[i] = array[i];
        }
        return result;
    }

    public static int[] takeLast(int[] array, int k) {
        if (k > array.length) {
            // Будем считать, что при очень большом K берётся весь массив
            k = array.length;
        }

        int[] result = new int[k];
        for (int i = 0; i < k; ++i) {
            result[i] = array[i + array.length - k];
        }
        return result;
    }
}