import java.util.Scanner;

public class Sem03Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите неотрицальное целое число N: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Ошибка: число должно быть неотрицательным");
        } else {
            int currentTrib = 0;
            int nextTrib = 0;
            int secondNextTrib = 1;
            for (int i = 1; i <= n; ++i) {
                int thirdNextFib = currentTrib + nextTrib + secondNextTrib;
                currentTrib = nextTrib;
                nextTrib = secondNextTrib;
                secondNextTrib = thirdNextFib;
            }
            System.out.printf("%d-е число Трибоначчи: %d%n", n, currentTrib);
        }
    }
}
