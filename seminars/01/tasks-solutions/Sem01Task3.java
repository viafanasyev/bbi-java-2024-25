public class Sem01Task3 {
    public static void main(String[] args) {
        byte b1 = 123;
        short s1 = 123;
        int i1 = 123;
        long l1 = 123;
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);

        // byte b2 = 123456; // Ошибка компиляции: 123456 превышает максимально возможное значение для byte (127)
        // short s2 = 123456; // Ошибка компиляции: 123456 превышает максимально возможное значение для short (32767)
        int i2 = 123456;
        long l2 = 123456;
        System.out.println(i2);
        System.out.println(l2);
    }
}
