package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {
    @Test
    public void testGetters() {
        Point point = new Point(7, 10);

        assertEquals(7, point.getX());
        assertEquals(10, point.getY());
    }

    @Test
    public void testDistanceFromZero() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        assertEquals(5, p1.euclideanDistance(p2));
    }

    @Test
    public void testDistance() {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(13, 14);
        assertEquals(5, p1.euclideanDistance(p2));
    }
}