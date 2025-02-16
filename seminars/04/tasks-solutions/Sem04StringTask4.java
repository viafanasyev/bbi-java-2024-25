import java.util.Scanner;

public class Sem04StringTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        int result = collectDigits(line);
        System.out.println(result);
    }

    public static int collectDigits(String line) {
        int result = 0;
        for (int i = 0; i < line.length(); ++i) {
            char c = line.charAt(i);
            if (Character.isDigit(c)) {
                int digit = Character.digit(c, 10); // Чтобы не переводить символ в цифру вручную, можно воспользоваться библиотечным методом digit
                result = result * 10 + digit;
            }
        }
        return result;
    }
}