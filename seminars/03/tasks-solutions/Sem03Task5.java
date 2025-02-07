import java.util.Scanner;

public class Sem03Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Ошибка: ожидалось положительное число");
        } else {
            System.out.print("Цифры в обратном порядке: ");
            do {
                System.out.print(number % 10);
                number /= 10;
            } while (number > 0);
            System.out.println();
        }
    }
}
