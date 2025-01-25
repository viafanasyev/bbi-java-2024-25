/**
 * Пример программы, использующей математические функции из класса Math
 */
public class MathExample {
	public static void main(String[] args) {

		// Math.sqrt - квадратный корень числа
		System.out.println(Math.sqrt(10));

		// Math.pow - возведение числа в степень
		System.out.println(Math.pow(1.5, 2.5));

		// Math.PI, Math.TAU, Math.E - три основных математических константы
		System.out.println(Math.PI);
		System.out.println(Math.TAU);
		System.out.println(Math.E);

		// Math.sin, Math.cos, Math.tan, ... - тригонометрические функции
		System.out.println(Math.sin(Math.PI / 2));
		System.out.println(Math.cos(0));
		System.out.println(Math.tan(0));

		// Math.abs - модуль числа
		System.out.println(Math.abs(-100));
		System.out.println(Math.abs(+100));

		// Это далеко не все функции класса Math
		// Все функции можно найти либо в документации (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html),
		//                         либо при использовании этого класса через IDEA (в выпадающем меню при наборе `Math.`)
	}
}
