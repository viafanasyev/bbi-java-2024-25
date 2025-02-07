import java.util.Scanner;

public class Sem03Task10 {
    public static void main(String[] args) {
        // См. Гипотеза Коллатца (1932 г.)
        // Утверждается, что для любого положительного числа при помощи данных двух операций всегда можно прийти в единицу
        // Является одной из нерешённых проблем математики (не имеет ни доказательства, ни опровержения)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Ошибка: число должно быть положительным");
        } else {
            int steps = 0;
            while (n != 1) {
                ++steps;
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
                System.out.println(n);
            }
            System.out.println("Количество шагов: " + steps);
        }
    }
}
