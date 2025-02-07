public class Sem03Task8 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 3000; ++i) {
            int digit1 = i / 1000;
            int digit2 = (i / 100) % 10;
            int digit3 = (i / 10) % 10;
            int digit4 = i % 10;
            if (
                    digit1 != digit2 &&
                    digit1 != digit3 &&
                    digit1 != digit4 &&
                    digit2 != digit3 &&
                    digit2 != digit4 &&
                    digit3 != digit4
            ) {
                System.out.println(i);
            }
        }
    }
}
