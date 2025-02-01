import java.util.Scanner;

public class Sem02Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        System.out.println(2 * (width + height));
        System.out.println(width * height);
    }
}
