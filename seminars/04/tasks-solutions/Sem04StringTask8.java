import java.util.Scanner;

public class Sem04StringTask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку из слов (через пробел): ");
        String[] words = scanner.nextLine().strip().split(" ");

        for (int i = 0; i < words.length; ++i) {
            String word = words[i];
            words[i] = word.substring(0, (word.length() + 1) / 2);
        }

        for (int i = 0; i < words.length; ++i) {
            System.out.print(words[i]);
            if (i != words.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}