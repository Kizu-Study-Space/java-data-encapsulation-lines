package ch.hslu.oop.lines;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {
    @Test
    public void getStartPoint() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(1, line.getStartPoint().getX());
        assertEquals(2, line.getStartPoint().getY());
    }

    @Test
    public void getEndPoint() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(3, line.getEndPoint().getX());
        assertEquals(4, line.getEndPoint().getY());
    }
}
