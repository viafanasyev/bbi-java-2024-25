import java.util.Scanner;

public class Sem05Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = parseDouble(scanner, "Введите координату x1: ");
        if (Double.isNaN(x1)) return;
        double y1 = parseDouble(scanner, "Введите координату y1: ");
        if (Double.isNaN(y1)) return;
        double x2 = parseDouble(scanner, "Введите координату x2: ");
        if (Double.isNaN(x2)) return;
        double y2 = parseDouble(scanner, "Введите координату y2: ");
        if (Double.isNaN(y2)) return;

        System.out.printf("Расстояние: %.6f%n", distance(x1, y1, x2, y2));
    }

    public static double parseDouble(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String doubleStr = scanner.nextLine();
        if (!isCorrectDouble(doubleStr)) {
            System.out.println("Ошибка: не число");
            // NaN (Not-a-Number) - специальное значение для float и double для случаев, когда результат не представим в этих типах
            // Например, результат 0.0 / 0.0 равен NaN
            // Воспользуемся им, чтобы отследить некорректные значения
            return Double.NaN;
        }
        return Double.parseDouble(doubleStr);
    }

    public static boolean isCorrectDouble(String str) {
        str = str.strip();
        if (str.isEmpty()) {
            return false;
        }
        boolean dotWasAlreadyMet = false;
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (i == 0 && (c == '-' || c == '+')) {
                continue;
            }
            if (c == '.') {
                if (dotWasAlreadyMet) {
                    return false; // Несколько точек - не double
                }
                dotWasAlreadyMet = true;
                continue;
            }
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        if (dotWasAlreadyMet && str.length() == 1) {
            // Строка из одного символа '.' - не double
            return false;
        }
        return true;
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double deltaX = Math.abs(x1 - x2);
        double deltaY = Math.abs(y1 - y2);
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}