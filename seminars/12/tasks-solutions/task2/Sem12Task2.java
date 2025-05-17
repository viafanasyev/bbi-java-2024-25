package task2;

public class Sem12Task2 {
    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
        System.out.println(factorial(0)); // 1
        System.out.println(factorial(-10)); // Exception
    }

    private static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of negative number is impossible: n = " + n);
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
