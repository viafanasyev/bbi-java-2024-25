package task2;

public class Point {
    private final double x;
    private final double y;

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

    public double euclideanDistance(Point other) {
        return Math.hypot(x - other.x, y - other.y);
    }
}

