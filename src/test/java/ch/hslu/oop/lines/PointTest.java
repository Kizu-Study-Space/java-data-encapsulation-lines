package ch.hslu.oop.lines;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    @Test
    public void testGetX() {
        Point point = new Point(1, 2);
        assertEquals(1, point.getX());
    }

    @Test
    public void testGetY() {
        Point point = new Point(1, 2);
        assertEquals(2, point.getY());
    }

    @Test
    public void testMoveRelative() {
        Point point = new Point(1, 2);
        Point newPoint = point.moveRelative(3, 4);
        assertEquals(4, newPoint.getX());
        assertEquals(6, newPoint.getY());

        Point vectorPoint = new Point(3, 4);
        newPoint = point.moveRelative(vectorPoint);
        assertEquals(4, newPoint.getX());
        assertEquals(6, newPoint.getY());
    }
}
