import java.util.Scanner;

public class Sem04StringTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку из слов (через пробел): ");
        String[] words = scanner.nextLine().strip().split(" ");

        for (int i = 0; i < words.length; ++i) {
            if (words[i].contains("Q")) {
                words[i] = null;
            }
        }

        for (int i = 0; i < words.length; ++i) {
            String word = words[i];
            if (word != null) {
                System.out.printf("Слово %d, длина %d%n", i, word.length());
            }
        }
    }
}