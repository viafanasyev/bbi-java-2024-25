package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    public void testGetters() {
        Circle circle = new Circle(new Point(3, 6), 42);

        assertEquals(3, circle.getCenter().getX());
        assertEquals(6, circle.getCenter().getY());
        assertEquals(42, circle.getRadius());

        circle.setCenter(new Point(-5, -10));
        circle.setRadius(34);

        assertEquals(-5, circle.getCenter().getX());
        assertEquals(-10, circle.getCenter().getY());
        assertEquals(34, circle.getRadius());
    }

    @Test
    public void testPerimeterUnitCircle() {
        Circle circle = new Circle(new Point(0, 0), 1);
        assertEquals(2 * Math.PI, circle.perimeter());
    }

    @Test
    public void testAreaUnitCircle() {
        Circle circle = new Circle(new Point(0, 0), 1);
        assertEquals(Math.PI, circle.area());
    }

    @Test
    public void testPerimeter() {
        Circle circle = new Circle(new Point(0, 0), 10);
        assertEquals(2 * Math.PI * 10, circle.perimeter());
    }

    @Test
    public void testArea() {
        Circle circle = new Circle(new Point(0, 0), 10);
        assertEquals(Math.PI * 100, circle.area());
    }

    @Test
    public void testPerimeterAfterSet() {
        Circle circle = new Circle(new Point(0, 0), 1);

        circle.setRadius(10);

        assertEquals(2 * Math.PI * 10, circle.perimeter());
    }

    @Test
    public void testAreaAfterSet() {
        Circle circle = new Circle(new Point(0, 0), 1);

        circle.setRadius(10);

        assertEquals(Math.PI * 100, circle.area());
    }

    @Test
    public void testIntersect() {
        Circle first = new Circle(new Point(0, 0), 1);
        Circle second = new Circle(new Point(0, 0), 10);

        assertFalse(first.intersectsWith(second));
    }

    @Test
    public void testIntersect2() {
        Circle first = new Circle(new Point(0, 0), 1);
        Circle second = new Circle(new Point(10, 0), 1);

        assertFalse(first.intersectsWith(second));
    }

    @Test
    public void testIntersect3() {
        Circle first = new Circle(new Point(0, 0), 1);
        Circle second = new Circle(new Point(1, 0), 1);

        assertTrue(first.intersectsWith(second));
    }
}