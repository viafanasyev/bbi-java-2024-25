public class Sem01Task5 {
	public static void main(String[] args) {
		int hundredSeconds = 100;
		System.out.println(hundredSeconds % 60); // Секунд
		System.out.println(hundredSeconds / 60 % 60); // Минут
		System.out.println(hundredSeconds / 60 / 60); // Часов
		System.out.println();

		int tenThousandSeconds = 10_000;
		System.out.println(tenThousandSeconds % 60); // Секунд
		System.out.println(tenThousandSeconds / 60 % 60); // Минут
		System.out.println(tenThousandSeconds / 60 / 60); // Часов
		System.out.println();

		int millionSeconds = 1_000_000;
		System.out.println(millionSeconds % 60); // Секунд
		System.out.println(millionSeconds / 60 % 60); // Минут
		System.out.println(millionSeconds / 60 / 60); // Часов
		System.out.println();

		long trillionSeconds = 1_000_000_000_000L;
		System.out.println(trillionSeconds % 60); // Секунд
		System.out.println(trillionSeconds / 60 % 60); // Минут
		System.out.println(trillionSeconds / 60 / 60); // Часов
	}
}
