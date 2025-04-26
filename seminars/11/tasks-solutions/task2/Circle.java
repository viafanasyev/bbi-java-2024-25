package task2;

public class Circle implements Shape {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
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
