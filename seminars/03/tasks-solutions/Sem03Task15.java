import java.util.Scanner;

public class Sem03Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double radius = scanner.nextDouble();

        while (true) {
            System.out.print("Введите координату X: ");
            double x = scanner.nextDouble();
            System.out.print("Введите координату Y: ");
            double y = scanner.nextDouble();

            if (x == 0 && y == 0) { // Сравнение с нулём через == будет довольно точным, т.к. это число с пользовательского ввода, а не результат вычислений
                break;
            }

            if (x * x + y * y > radius * radius) {
                System.out.println("Точка лежит снаружи окружности");
            } else {
                System.out.println("Точка лежит внутри окружности");
            }
        }
    }
}
