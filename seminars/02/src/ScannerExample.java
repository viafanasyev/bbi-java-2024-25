import java.util.Scanner; // Программы не зависят по умолчанию от класса Scanner, поэтому его нужно импортировать явно

/**
 * Пример программы, считающей сумму двух введённых пользователем чисел
 */
public class ScannerExample {
	public static void main(String[] args) {
		// Scanner - класс, позволяющий удобно обрабатывать входные данные
		// Для взаимодействия с ним необходимо создать *экземпляр* этого класса
		//     Для этого нужно вызвать т.н. конструктор при помощи оператора `new`: `new Scanner(...)`
		//     В качестве аргумента в конструктор передаётся источник данных для чтения
		//         В нашем случае - это стандартный поток ввода, т.е. `System.in`
		// Классы - суть есть типы (как int, boolean и т.д.). Поэтому экземпляры классов сохраняются в переменные, имеющие тип этих классов.
		//     Более подробно про понятие классов, объектов, экземпляров мы познакомимся на лекциях про ООП

		//    / Тип, обязательно Scanner
		//   |     / Имя переменной, хранящей объект типа Scanner; может быть любым
		//   |    |          / Создание экземпляра класса Scanner
		//   |    |         |          / Источник входных данных; может также быть файлом, потоком ввода из сети и т.д.
		//   V    V         V         V
		Scanner input = new Scanner(System.in);

		System.out.print("Введите первое число: ");

		// Метод `nextInt` позволяет считать следующее число типа int
		// Важно: Метод вызывается на объекте типа Scanner, т.е. на переменной `input`
		//        Это отличается от того, как мы взаимодействовали с методами из класса Math (а-ля `Math.sin(...)`)
		//        С чем связано это отличие, мы обсудим на будущих лекциях
		int first = input.nextInt();

		System.out.print("Введите второе число: ");
		int second = input.nextInt();

		System.out.print("Cумма чисел: ");
		System.out.println(first + second);
	}
}