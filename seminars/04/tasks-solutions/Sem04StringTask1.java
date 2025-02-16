import java.util.Scanner;

public class Sem04StringTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        String reversedLine = reverseString(line);
        System.out.println(reversedLine);
    }

    public static String reverseString(String line) {
        String result = "";
        for (int i = line.length() - 1; i >= 0; --i) {
            char c = line.charAt(i); // NOTE: т.к. здесь оперируют char'ами (т.е. code unit'ами), а не code point'ами, могут быть проблемы с символами, состоящими из двух code unit'ов. Но ради простоты опустим этот момент
            result += c;
        }
        return result;
    }
}