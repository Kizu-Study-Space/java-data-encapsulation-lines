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
}
