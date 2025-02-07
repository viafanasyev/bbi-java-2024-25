import java.util.Scanner;

public class Sem03Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите левую границу: ");
        int l = scanner.nextInt();
        System.out.print("Введите правую границу: ");
        int r = scanner.nextInt();
        System.out.print("Введите целое ненулевое число P: ");
        int p = scanner.nextInt();
        if (l > r) {
            System.out.println("Ошибка: левая граница должна быть не больше правой");
        } else if (p == 0) {
            System.out.println("Ошибка: P не должно быть нулём");
        } else {
            for (int i = l; i <= r; ++i) {
                if (i % p == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
