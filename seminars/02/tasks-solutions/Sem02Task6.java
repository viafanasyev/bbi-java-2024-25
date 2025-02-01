import java.util.Scanner;

public class Sem02Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean isEven = number % 2 == 0;
        System.out.println(isEven);
    }
}
