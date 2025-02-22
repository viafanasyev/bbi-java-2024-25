import java.util.Scanner;

public class Sem05Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = parseArrayLength(scanner);
        if (length < 0) return;

        int[] array = parseArray(length, scanner);
        if (array == null) return;

        while (true) {
            int value = parseInteger(scanner);
            if (value == Integer.MIN_VALUE) {
                break;
            }

            int indexOfFirst = indexOfFirst(array, value);
            int indexOfLast = indexOfLast(array, value);

            if (indexOfFirst != -1 && indexOfLast != -1) {
                System.out.printf("Первое вхождение: %d, последнее вхождение: %d%n", indexOfFirst, indexOfLast);
            } else {
                System.out.println("Число не входит в массив");
            }
        }
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

    public static int parseInteger(Scanner scanner) {
        System.out.print("Введите целое число: ");
        String integerStr = scanner.nextLine();
        if (!isCorrectInteger(integerStr)) {
            System.out.println("Ошибка: не число");
            // Необходимо вернуть какое-то число, которое будет говорить об ошибке
            // Придётся пожертвовать -2^31, т.к. другого способа у нас пока нет
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(integerStr);
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

    public static int indexOfFirst(int[] array, int value) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfLast(int[] array, int value) {
        for (int i = array.length - 1; i >= 0; --i) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}