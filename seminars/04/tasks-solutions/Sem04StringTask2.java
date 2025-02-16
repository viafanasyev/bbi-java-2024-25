import java.util.Scanner;

public class Sem04StringTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        String result = swapCase(line);
        System.out.println(result);
    }

    public static String swapCase(String line) {
        String result = "";
        for (int i = 0; i < line.length(); ++i) {
            char c = line.charAt(i); // NOTE: т.к. здесь оперируют char'ами (т.е. code unit'ами), а не code point'ами, могут быть проблемы с символами, состоящими из двух code unit'ов. Но ради простоты опустим этот момент
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                // Случай, когда символ не является буквой (например, знак препинания)
                result += c;
            }
        }
        return result;
    }
}