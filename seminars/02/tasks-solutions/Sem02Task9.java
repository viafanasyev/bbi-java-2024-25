import java.util.Scanner;

public class Sem02Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int lastDigitOfFirst = first % 10;
        int lastDigitOfSecond = second % 10;

        System.out.println(lastDigitOfFirst == lastDigitOfSecond);
    }
}
