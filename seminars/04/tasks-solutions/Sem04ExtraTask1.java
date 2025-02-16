import java.util.Scanner;

public class Sem04ExtraTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        int shift = parseShift(scanner);
        if (shift < 0) return;

        String result = encodeCaesar(line, shift);
        System.out.println(result);
    }

    public static int parseShift(Scanner scanner) {
        System.out.print("Введите целое число от 0 до 26: ");
        String positiveIntStr = scanner.nextLine();
        if (!isCorrectInteger(positiveIntStr)) {
            System.out.println("Ошибка: не число");
            return -1;
        }
        int positiveInt = Integer.parseInt(positiveIntStr);
        if (positiveInt < 0 || positiveInt > 26) {
            System.out.println("Ошибка: должно вводиться число от 0 до 26");
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
                // Знак '+' или '-' в начале числа - OK, положительное или отричательное число
                continue;
            }
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static String encodeCaesar(String line, int shift) {
        // Идея:
        //   Присвоить каждой букве алфавита индекс: A=0, B=1, C=2, ... Y=24, Z=25
        //   Перевести каждую букву строки в её индекс
        //   Циклически сдвинуть число (т.е. прибавить сдвиг по модулю 26)
        //   Из числа получить букву по индексу
        final int ALPHABET_LENGTH = 26; // Количество латинских букв
        String result = "";
        for (int i = 0; i < line.length(); ++i) {
            char c = line.charAt(i); // NOTE: т.к. здесь оперируют char'ами (т.е. code unit'ами), а не code point'ами, могут быть проблемы с символами, состоящими из двух code unit'ов. Но ради простоты опустим этот момент
            if (Character.isUpperCase(c)) {
                int indexInAlphabet = c - 'A';
                indexInAlphabet = (indexInAlphabet + shift) % ALPHABET_LENGTH;
                c = (char) (indexInAlphabet + 'A');
            } else if (Character.isLowerCase(c)) {
                int indexInAlphabet = c - 'a';
                indexInAlphabet = (indexInAlphabet + shift) % ALPHABET_LENGTH;
                c = (char) (indexInAlphabet + 'a');
            }
            result += c;
        }
        return result;
    }
}