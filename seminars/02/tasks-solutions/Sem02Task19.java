import java.util.Scanner;

public class Sem02Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // |first - second| / 2 - половина разницы между числами
        // (first + second) / 2 - среднее арифметическое из двух чисел

        // Представим это на числовой прямой:
        //
        //       first                         second
        //         |                             |
        //         |      (first + second) / 2   |
        //         |              |              |
        //         V              V              V
        // --------*--------------*--------------*--------
        //                         \____________/
        //                               ^
        //                               |
        //                       |first - second| / 2
        //

        // Таким образом, |first - second| / 2 + (first + second) / 2 - это максимум из двух чисел

        // Деление лучше осуществлять не на каждом из подвыражений, а на результате, чтобы избежать вещественных чисел (и, как следствие, потери точности)
        // Несложно доказать, что (|first - second| + (first + second)) - это всегда чётное число, поэтому целочисленное деление будет успешно
        int max = (Math.abs(first - second) + first + second) / 2;
        System.out.println(max);
    }
}
