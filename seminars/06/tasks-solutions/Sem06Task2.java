public class Sem06Task2 {
    public static void main(String[] args) {
        Triangle rightTriangle = new Triangle(
                0, 0,
                3, 0,
                0, 4
        );
        System.out.println(rightTriangle.perimeter());
        System.out.println(rightTriangle.area());

        Triangle someRandomTriangle = new Triangle(
                new Point(1, 3),
                new Point(-4, 5),
                new Point(2, 2)
        );
        System.out.println(someRandomTriangle.perimeter());
        System.out.println(someRandomTriangle.area());
    }
}
