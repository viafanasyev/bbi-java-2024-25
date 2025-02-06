import java.util.Scanner;

/**
 * Пример чтения одного числа с пользовательского ввода, обрабатывающий некорректный ввод и сообщающий об ошибке
 */
public class ProperParsingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String line = scanner.nextLine(); // Считываем всю строку целиком (метод nextInt не подходит, т.к. он не способен обработать некорректный ввод)
        line = line.strip(); // Убираем пробельные символы по краям

        // Пустая строка - это не число. Сообщаем об ошибке и выходим
        if (line.isEmpty()) {
            System.out.println("Ошибка: пустая строка");
            return;
        }

        for (int i = 0; i < line.length(); i++) {
            int c = line.charAt(i); // NOTE: т.к. здесь оперируют char'ами (т.е. code unit'ами), а не code point'ами, могут быть проблемы с символами, состоящими из двух code unit'ов. Но ради простоты опустим этот момент
            if (!Character.isDigit(c)) { // Проверяем, является ли каждый символ цифрой. Если нет - сообщаем об ошибке и выходим
                System.out.println("Ошибка: не число");
                return;
            }
        }

        // NOTE: данный способ некорректно обрабатывает числа, выходящие за пределы допустимых значение типа int. Но ради простоты опустим этот момент (в будущем мы посмотрим, как можно обработать такой случай проще)
        // NOTE: данный способ не учитывает отрицательные числа

        int value = Integer.parseInt(line); // Парсим строку, как число
        System.out.println("Прочитанное число: " + value);
    }
}
