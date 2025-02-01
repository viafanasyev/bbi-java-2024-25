import java.util.Scanner;

public class Sem02Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        double result = x + Math.log(x);

        // , - группировка по разрядам
        // + - добавление знака к положительным числам
        // .4 - округление до 4 знаков после запятой
        // f - вещественное число
        System.out.printf("%,+.4f", result);
    }
}
