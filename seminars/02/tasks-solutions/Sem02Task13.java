import java.util.Scanner;

public class Sem02Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = Math.sqrt(a * a + b * b);

        System.out.printf("Гипотенуза: %.3f%n", c);

        // Также можно воспользоваться библиотечной функцией Math.hypot
        System.out.printf("Гипотенуза: %.3f%n", Math.hypot(a, b));
    }
}
