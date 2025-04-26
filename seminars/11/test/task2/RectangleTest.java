package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    public void testGetters() {
        Rectangle rectangle = new Rectangle(65, 34);

        assertEquals(65, rectangle.getWidth());
        assertEquals(34, rectangle.getHeight());

        rectangle.setWidth(17);
        rectangle.setHeight(28);

        assertEquals(17, rectangle.getWidth());
        assertEquals(28, rectangle.getHeight());
    }

    @Test
    public void testPerimeter() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(30, rectangle.perimeter());
    }

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(50, rectangle.area());
    }

    @Test
    public void testPerimeterAfterSet() {
        Rectangle rectangle = new Rectangle(10, 5);

        rectangle.setHeight(7);
        rectangle.setWidth(6);

        assertEquals(26, rectangle.perimeter());
    }

    @Test
    public void testAreaAfterSet() {
        Rectangle rectangle = new Rectangle(10, 5);

        rectangle.setHeight(7);
        rectangle.setWidth(6);

        assertEquals(42, rectangle.area());
    }
}