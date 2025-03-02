public class Circle {
    private final Point center;
    private final double radius;

    public Circle(double x, double y, double radius) {
        this(
                new Point(x, y),
                radius
        );
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public boolean intersectsWith(Circle other) {
        double distanceBetweenCenters = center.euclideanDistance(other.center);
        if (distanceBetweenCenters > radius + other.radius) {
            return false;
        }
        if (distanceBetweenCenters < Math.abs(radius - other.radius)) {
            return false;
        }
        return true;
    }
}
