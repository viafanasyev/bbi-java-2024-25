public class Sem06Task1 {
    public static void main(String[] args) {
        Point center = new Point();
        printPointInfo(center);

        Point firstQuarter = new Point(1, 1);
        printPointInfo(firstQuarter);

        Point secondQuarter = new Point(-3, 4);
        printPointInfo(secondQuarter);

        Point thirdQuarter = new Point(-1, -1);
        printPointInfo(thirdQuarter);

        Point fourthQuarter = new Point(10, -4);
        printPointInfo(fourthQuarter);

        System.out.printf(
                "Евклидово расстояние между (%.3f, %.3f) и (%.3f, %.3f) равно %.3f%n",
                firstQuarter.getX(),
                firstQuarter.getY(),
                secondQuarter.getX(),
                secondQuarter.getY(),
                firstQuarter.euclideanDistance(secondQuarter)
        );

        System.out.printf(
                "Манхэттенское расстояние между (%.3f, %.3f) и (%.3f, %.3f) равно %.3f%n",
                firstQuarter.getX(),
                firstQuarter.getY(),
                secondQuarter.getX(),
                secondQuarter.getY(),
                firstQuarter.manhattanDistance(secondQuarter)
        );
    }

    private static void printPointInfo(Point point) {
        System.out.printf(
                "Точка (%.3f, %.3f), полярный радиус = %.3f, полярный угол = %.3f (в градусах)%n",
                point.getX(),
                point.getY(),
                point.getPolarRadius(),
                Math.toDegrees(point.getPolarAngle())
        );
    }
}
