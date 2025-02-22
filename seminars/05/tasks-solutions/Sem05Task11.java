public class Sem05Task11 {
    public static void main(String[] args) {
        String example1 = "123";
        System.out.printf("Строка '%s' %s корректным числом%n", example1, isCorrectInteger(example1) ? "является" : "не является");

        String example2 = "    123    ";
        System.out.printf("Строка '%s' %s корректным числом%n", example2, isCorrectInteger(example2) ? "является" : "не является");

        String example3 = "abacaba";
        System.out.printf("Строка '%s' %s корректным числом%n", example3, isCorrectInteger(example3) ? "является" : "не является");
    }

    public static boolean isCorrectInteger(String str) {
        str = str.strip();
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (i == 0 && (c == '-' || c == '+')) {
                // Знак '+' или '-' в начале числа - OK, положительное или отрицательное число
                continue;
            }
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
