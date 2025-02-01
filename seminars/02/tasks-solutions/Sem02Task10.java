import java.util.Scanner;

public class Sem02Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int firstDigitOfFirst = first / 10;
        int lastDigitOfFirst = first % 10;
        int firstDigitOfSecond = second / 10;
        int lastDigitOfSecond = second % 10;

        boolean firstDigitAppearsInSecond = firstDigitOfFirst == firstDigitOfSecond || firstDigitOfFirst == lastDigitOfSecond;
        boolean lastDigitAppearsInSecond = lastDigitOfFirst == firstDigitOfSecond || lastDigitOfFirst == lastDigitOfSecond;
        System.out.println(firstDigitAppearsInSecond || lastDigitAppearsInSecond);
    }
}
