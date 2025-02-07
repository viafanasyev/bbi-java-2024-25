import java.util.Scanner;

public class Sem03Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        // См. Wiki:
        //   год, номер которого кратен 400, - високосный;
        //   остальные годы, номер которых кратен 100, - невисокосные;
        //   остальные годы, номер которых кратен 4, - високосные;
        //   все остальные годы — невисокосные.
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.printf("Год %d високосный%n", year);
        } else {
            System.out.printf("Год %d не високосный%n", year);
        }
    }
}
