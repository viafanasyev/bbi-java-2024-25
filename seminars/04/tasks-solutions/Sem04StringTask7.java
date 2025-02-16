import java.util.Scanner;

public class Sem04StringTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку из слов (через пробел): ");
        String[] words = scanner.nextLine().strip().split(" ");

        if (words.length < 2) {
            System.out.println("Слишком мало слов");
            return;
        }

        System.out.printf("Второе слово с начала: %s%n", words[1]);
        System.out.printf("Второе слово с конца: %s%n", words[words.length - 2]);
    }
}