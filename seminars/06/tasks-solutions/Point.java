public class Point {
    private final double x;
    private final double y;

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getPolarAngle() {
        // atan2 = atan(y / x) с правильным учётом всех четвертей
        //   (см. документацию на данный метод)
        return Math.atan2(y, x);
    }

    public double getPolarRadius() {
        // hypot = sqrt(x^2 + y^2)
        return Math.hypot(x, y);
    }

    public double euclideanDistance(Point other) {
        return Math.hypot(x - other.x, y - other.y);
    }

    public double manhattanDistance(Point other) {
        return Math.abs(x - other.x) + Math.abs(x - other.y);
    }
}
