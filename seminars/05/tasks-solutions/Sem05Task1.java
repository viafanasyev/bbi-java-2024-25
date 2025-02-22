public class Sem05Task1 {
    public static void main(String[] args) {
        for (int a = 1; a <= 20; ++a) {
            for (int b = 1; b <= 20; ++b) {
                for (int c = 1; c <= 20; ++c) {
                    if (isPythagoreanTriple(a, b, c)) {
                        System.out.printf("%d^2 + %d^2 = %d^2%n", a, b, c);
                    }
                }
            }
        }
    }

    public static boolean isPythagoreanTriple(int a, int b, int c) {
        return a * a + b * b == c * c;
    }
}