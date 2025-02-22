public class Sem05Task12 {
    public static void main(String[] args) {
        println("1", "2", "3", "4", "5", "6");
        println("A", "bc", "def");
    }

    public static void println(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if (i + 1 != args.length) {
                System.out.print(' ');
            }
        }
        System.out.println();
    }
}
