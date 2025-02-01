import java.util.Scanner;

public class Sem02Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte x = scanner.nextByte();

        // Побитовое "И" любого бита с битом 1 не меняет его значение
        // Побитовое "И" любого бита с битом 0 превращает его в 0
        // Таким образом, побитовое "И" с маской 0b11111100 обнулит два младших бита, но не тронет остальные
        // Приведение к типу byte необходимо, так как результат битовых операций всегда имеет тип int
        byte result = (byte) (x & 0b11111100);

        System.out.print("Двоичное представление (исходное число): ");
        // Вывод всех бит числа. См. задачу 18 для пояснений.
        System.out.print((x >> 7) & 1);
        System.out.print((x >> 6) & 1);
        System.out.print((x >> 5) & 1);
        System.out.print((x >> 4) & 1);
        System.out.print((x >> 3) & 1);
        System.out.print((x >> 2) & 1);
        System.out.print((x >> 1) & 1);
        System.out.println((x >> 0) & 1);

        System.out.print("Двоичное представление (2 младших бита обнулены): ");
        System.out.print((result >> 7) & 1);
        System.out.print((result >> 6) & 1);
        System.out.print((result >> 5) & 1);
        System.out.print((result >> 4) & 1);
        System.out.print((result >> 3) & 1);
        System.out.print((result >> 2) & 1);
        System.out.print((result >> 1) & 1);
        System.out.println((result >> 0) & 1);

        System.out.printf("Десятичное значение (2 младших бита обнулены): %d%n", result);
    }
}
