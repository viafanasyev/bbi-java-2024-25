import java.util.Scanner;

public class Sem02Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short x = scanner.nextShort();

        byte lowByte = (byte) x; // Приведение к типу байт равноценно взятию 8 младших бит (т.е. младшего бита); см. лекцию №2 для пояснений
        byte highByte = (byte) (x >> 8); // Сдвиг вправо на 8 бит перемещает старшие биты в позицию младших; по аналогии с lowByte, приводим к byte для взятия одного младшего байта

        // Смещаем младший байт в позицию старшего, а старший - в позицию младшего
        // Побитовое "ИЛИ" объединит два этих байта
        // Все побитовые операции неявно приводят операнды к типу int, поэтому ответ может неправильно вычисляться при отрицательных highByte
        //   Когда отрицательный highByte будет неявно расширен до int, все его биты начиная с 9 будут равны единице
        //   Чтобы этого избежать, здесь делается побитовое "И" с 0b11111111, чтобы взять только 8 бит числа
        short reversedX = (short) ((lowByte << 8) | (highByte & 0b11111111));

        System.out.print("Двоичное представление (исходное число): ");
        // Вывод всех бит числа. См. задачу 18 для пояснений.
        System.out.print((x >> 15) & 1);
        System.out.print((x >> 14) & 1);
        System.out.print((x >> 13) & 1);
        System.out.print((x >> 12) & 1);
        System.out.print((x >> 11) & 1);
        System.out.print((x >> 10) & 1);
        System.out.print((x >> 9) & 1);
        System.out.print((x >> 8) & 1);
        System.out.print((x >> 7) & 1);
        System.out.print((x >> 6) & 1);
        System.out.print((x >> 5) & 1);
        System.out.print((x >> 4) & 1);
        System.out.print((x >> 3) & 1);
        System.out.print((x >> 2) & 1);
        System.out.print((x >> 1) & 1);
        System.out.println((x >> 0) & 1);

        System.out.print("Старший байт: ");
        System.out.print((highByte >> 7) & 1);
        System.out.print((highByte >> 6) & 1);
        System.out.print((highByte >> 5) & 1);
        System.out.print((highByte >> 4) & 1);
        System.out.print((highByte >> 3) & 1);
        System.out.print((highByte >> 2) & 1);
        System.out.print((highByte >> 1) & 1);
        System.out.println((highByte >> 0) & 1);

        System.out.print("Младший байт: ");
        System.out.print((lowByte >> 7) & 1);
        System.out.print((lowByte >> 6) & 1);
        System.out.print((lowByte >> 5) & 1);
        System.out.print((lowByte >> 4) & 1);
        System.out.print((lowByte >> 3) & 1);
        System.out.print((lowByte >> 2) & 1);
        System.out.print((lowByte >> 1) & 1);
        System.out.println((lowByte >> 0) & 1);

        System.out.print("Двоичное представление (байты в обратном порядке): ");
        System.out.print((reversedX >> 15) & 1);
        System.out.print((reversedX >> 14) & 1);
        System.out.print((reversedX >> 13) & 1);
        System.out.print((reversedX >> 12) & 1);
        System.out.print((reversedX >> 11) & 1);
        System.out.print((reversedX >> 10) & 1);
        System.out.print((reversedX >> 9) & 1);
        System.out.print((reversedX >> 8) & 1);
        System.out.print((reversedX >> 7) & 1);
        System.out.print((reversedX >> 6) & 1);
        System.out.print((reversedX >> 5) & 1);
        System.out.print((reversedX >> 4) & 1);
        System.out.print((reversedX >> 3) & 1);
        System.out.print((reversedX >> 2) & 1);
        System.out.print((reversedX >> 1) & 1);
        System.out.println((reversedX >> 0) & 1);

        System.out.printf("Десятичное значение (байты в обратном порядке): %d%n", reversedX);
    }
}
