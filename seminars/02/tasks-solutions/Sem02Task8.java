import java.util.Scanner;

public class Sem02Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int intDivision = first / second; // Деление int / int - целочисленное
        double floatingPointDivision = first / ((double) second); // Для вещественного деления один из операндов должен иметь тип float или double

        System.out.println(intDivision);
        System.out.println(floatingPointDivision);
    }
}
