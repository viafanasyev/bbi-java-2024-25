import java.util.Scanner;

public class Sem03Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите неотрицальное целое число N: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Ошибка: число должно быть неотрицательным");
        } else {
            int currentFib = 0;
            int nextFib = 1;
            for (int i = 1; i <= n; ++i) {
                int secondNextFib = currentFib + nextFib;
                currentFib = nextFib;
                nextFib = secondNextFib;
            }
            System.out.printf("%d-е число Фибоначчи: %d%n", n, currentFib);
        }
    }
}
