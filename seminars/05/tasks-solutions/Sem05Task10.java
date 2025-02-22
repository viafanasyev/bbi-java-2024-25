import java.util.Scanner;

public class Sem05Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите основание: ");
            String baseString = scanner.nextLine().strip();
            if (!isCorrectInteger(baseString)) {
                System.out.println("Ошибка: не число");
                break;
            }
            int base = Integer.parseInt(baseString);

            System.out.print("Введите степень: ");
            String expString = scanner.nextLine().strip();
            if (!isCorrectInteger(expString)) {
                System.out.println("Ошибка: не число");
                break;
            }
            int exp = Integer.parseInt(expString);
            if (exp < 0) {
                System.out.println("Ошибка: степень должна быть неотрицательным числом");
                break;
            }

            System.out.printf("%d^%d = %d%n", base, exp, power(base, exp));
        }
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

    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp % 2 == 0) {
            int half = power(base, exp / 2);
            return half * half;
        } else {
            return base * power(base, exp - 1);
        }
    }
}
