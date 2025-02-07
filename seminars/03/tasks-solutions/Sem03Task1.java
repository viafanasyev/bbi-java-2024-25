import java.util.Scanner;

public class Sem03Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца (1-12): ");
        int monthNumber = scanner.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Ошибка: число должно лежать в диапазоне [1; 12]");
        } else {
            String monthName = switch (monthNumber) {
                case 1 -> "Январь";
                case 2 -> "Февраль";
                case 3 -> "Март";
                case 4 -> "Апрель";
                case 5 -> "Май";
                case 6 -> "Июнь";
                case 7 -> "Июль";
                case 8 -> "Август";
                case 9 -> "Сентябрь";
                case 10 -> "Октябрь";
                case 11 -> "Ноябрь";
                case 12 -> "Декабрь";
                default -> "?"; // Это условие недостижимо, но компилятор недостаточно умён, чтобы разрешить нам не писать его
            };
            int daysInMonth = switch (monthNumber) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 28;
                case 4, 6, 9, 11 -> 30;
                default -> -1; // Это условие недостижимо, но компилятор недостаточно умён, чтобы разрешить нам не писать его
            };
            System.out.printf("В месяце '%s' %d дней%n", monthName, daysInMonth);
        }
    }
}
