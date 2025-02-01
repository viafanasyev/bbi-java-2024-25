import java.util.Scanner;

public class Sem02Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte x = scanner.nextByte();

        // x & 1 - это младший (1-й) бит числа

        // x >> 1 - это число, у которого 2-й бит исходного числа стоит на месте 1-го, 3-й на месте 2-го, 4-й на месте 3-го и т.д.
        // (x >> 1) & 1 - 2-й бит числа

        // (x >> 2) & 1 - 3-й бит числа

        // (x >> i) & 1 - (i-1)-й бит числа

        // Выводим биты от старшего к младшему (от 8-го к 1-му)
        System.out.print((x >> 7) & 1);
        System.out.print((x >> 6) & 1);
        System.out.print((x >> 5) & 1);
        System.out.print((x >> 4) & 1);
        System.out.print((x >> 3) & 1);
        System.out.print((x >> 2) & 1);
        System.out.print((x >> 1) & 1);
        System.out.println((x >> 0) & 1);
    }
}
