import java.util.Scanner;

public class Sem04StringTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку из слов (через пробел): ");
        String[] words = scanner.nextLine().strip().split(" ");

        String result = collectFirstChars(words);
        System.out.println(result);
    }

    public static String collectFirstChars(String[] words) {
        String result = "";
        for (int i = 0; i < words.length; ++i) {
            char firstChar = words[i].charAt(0);
            result += firstChar;
        }
        return result;
    }
}