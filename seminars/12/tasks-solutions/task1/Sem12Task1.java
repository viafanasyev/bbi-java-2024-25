package task1;

public class Sem12Task1 {
    public static void main(String[] args) {
        System.out.println(parseIntOrZero("123")); // 123
        System.out.println(parseIntOrZero("-10")); // -10
        System.out.println(parseIntOrZero("Hello")); // 0
        System.out.println(parseIntOrZero("123456789123456789")); // 0
    }

    private static int parseIntOrZero(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException ignored) {
            return 0;
        }
    }
}
