import java.util.Scanner;

public class Sem02Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lowerCaseLetter = scanner.next().charAt(0); // К сожалению, метода nextChar у Scanner нет, поэтому приходится считывать строку и брать её первый символ...

        // (letter - 'a') - порядковый номер буквы
        // Прибавление её к коду 'A' даёт нужную заглавную букву
        // Мы пользуемся тем свойством, что буквы в таблице ASCII расположены в алфавитном порядке
        char upperCaseLetter = (char) (lowerCaseLetter - 'a' + 'A');
        System.out.println(upperCaseLetter);

        // Character.toUpperCase выполняет ту же задачу (но ещё и корректно учитывает символы других алфавитов)
        char upperCaseLetterV2 = Character.toUpperCase(lowerCaseLetter);
        System.out.println(upperCaseLetterV2);
    }
}
