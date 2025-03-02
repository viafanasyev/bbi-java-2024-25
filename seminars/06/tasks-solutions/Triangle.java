public class Triangle {
    private final Point p1;
    private final Point p2;
    private final Point p3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this(
                new Point(x1, y1),
                new Point(x2, y2),
                new Point(x3, y3)
        );
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double perimeter() {
        return p1.euclideanDistance(p2) + p2.euclideanDistance(p3) + p3.euclideanDistance(p1);
    }

    public double area() {
        double side1 = p1.euclideanDistance(p2);
        double side2 = p2.euclideanDistance(p3);
        double side3 = p3.euclideanDistance(p1);
        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }
}
