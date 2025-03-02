public class Sem06Task3 {
    public static void main(String[] args) {
        Circle unitCircle = new Circle(new Point(), 1);
        System.out.println(unitCircle.perimeter());
        System.out.println(unitCircle.area());

        System.out.println(unitCircle.intersectsWith(new Circle(0, 0, 2))); // Вложенные окружности
        System.out.println(unitCircle.intersectsWith(new Circle(2, 0, 1))); // Внешнее касание
        System.out.println(unitCircle.intersectsWith(new Circle(2, 0, 2))); // Внутреннее касание
        System.out.println(unitCircle.intersectsWith(new Circle(1, 0, 1))); // Две точки пересечения
        System.out.println(unitCircle.intersectsWith(new Circle(2, 0, 1.5))); // Две точки пересечения
        System.out.println(unitCircle.intersectsWith(new Circle(0.7, 0, 1))); // Две точки пересечения
        System.out.println(unitCircle.intersectsWith(unitCircle)); // Эквивалентные окружности
    }
}
