import java.util.Scanner;

public class Sem02Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();

        System.out.println(2 * Math.PI * radius);
        System.out.println(Math.PI * radius * radius);
    }
}
