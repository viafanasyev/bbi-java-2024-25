import java.util.Scanner;

public class Sem04StringTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String firstLine = scanner.nextLine();

        System.out.print("Введите строку: ");
        String secondLine = scanner.nextLine();

        if (firstLine.startsWith(secondLine)) {
            System.out.println("Вторая строка является префиксом первой");
        } else {
            System.out.println("Вторая строка НЕ является префиксом первой");
        }
    }
}