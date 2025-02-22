public class Sem05Task6 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10000; ++x) {
            if (numberOfDigits(x) == sumOfDigits(x)) {
                System.out.println(x);
            }
        }
    }

    public static int numberOfDigits(int x) {
        int numberOfDigits = 0;
        do {
            ++numberOfDigits;
            x /= 10;
        } while (x != 0);
        return numberOfDigits;
    }

    public static int sumOfDigits(int x) {
        int sumOfDigits = 0;
        while (x != 0) {
            sumOfDigits += x % 10;
            x /= 10;
        }
        return sumOfDigits;
    }
}