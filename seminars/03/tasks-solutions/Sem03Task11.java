import java.util.Scanner;

public class Sem03Task11 {

    // Точность сравнения (абсолютная погрешность)
    // Если модуль числа X не отличим до 6 знака от нуля (т.е. |X| < EPS), то будем считать его нулём
    public static final double EPS = 1E-6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите коэффициент b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите коэффициент c: ");
        double c = scanner.nextDouble();

        if (Math.abs(a) < EPS) {
            // a == 0. Линейное уравнение bx + c = 0
            if (Math.abs(b) < EPS) {
                // b == 0. Уравнение c == 0
                if (Math.abs(c) < EPS) {
                    // 0 == 0
                    System.out.println("Бесконечно много решений");
                } else {
                    // c == 0 (при c != 0)
                    System.out.println("Нет решений в вещественных числах");
                }
            } else {
                // b != 0. Одно решение
                double x = -c / b;
                System.out.printf("Одно решение: X = %.6f%n", x);
            }
        } else {
            // a != 0. Квадратное уравнение ax^2 + bx + c = 0
            double discriminant = b * b - 4 * a * c;
            if (discriminant > EPS) {
                // D > 0. Два корня
                double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Два решения: X1 = %.6f, X2 = %.6f%n", x1, x2);
            } else if (Math.abs(discriminant) < EPS) {
                // D == 0. Один корень
                double x = -b / (2 * a);
                System.out.printf("Одно решение: X = %.6f%n", x);
            } else {
                // D < 0. Ноль корней
                System.out.println("Нет решений в вещественных числах");
            }
        }
    }
}
