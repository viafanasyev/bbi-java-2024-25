import java.util.Scanner;

public class Sem05Task3 {
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
        double x3 = parseDouble(scanner, "Введите координату x3: ");
        if (Double.isNaN(x3)) return;
        double y3 = parseDouble(scanner, "Введите координату y3: ");
        if (Double.isNaN(y3)) return;

        System.out.printf("Периметр: %.6f%n", perimeter(x1, y1, x2, y2, x3, y3));
        System.out.printf("Площадь: %.6f%n", area(x1, y1, x2, y2, x3, y3));
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

    public static double area(double x1, double y1, double x2, double y2, double x3, double y3) {
        double side12 = distance(x1, y1, x2, y2);
        double side23 = distance(x2, y2, x3, y3);
        double side31 = distance(x3, y3, x1, y1);
        double halfPerimeter = perimeter(x1, y1, x2, y2, x3, y3) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side12) * (halfPerimeter - side23) * (halfPerimeter - side31));
    }

    public static double perimeter(double x1, double y1, double x2, double y2, double x3, double y3) {
        double side12 = distance(x1, y1, x2, y2);
        double side23 = distance(x2, y2, x3, y3);
        double side31 = distance(x3, y3, x1, y1);
        return side12 + side23 + side31;
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double deltaX = Math.abs(x1 - x2);
        double deltaY = Math.abs(y1 - y2);
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}