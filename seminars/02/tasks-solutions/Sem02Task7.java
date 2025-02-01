import java.util.Scanner;

public class Sem02Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int lastDigit = number % 10;
        System.out.println(lastDigit);
    }
}
