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

    @Test
    public void setStartPoint() {
        Line line = new Line(1, 2, 3, 4);
        line.setStartPoint(new Point(5, 6));
        assertEquals(5, line.getStartPoint().getX());
        assertEquals(6, line.getStartPoint().getY());

        line.setStartPoint(7, 8);
        assertEquals(7, line.getStartPoint().getX());
        assertEquals(8, line.getStartPoint().getY());
    }

    @Test
    public void setEndPoint() {
        Line line = new Line(1, 2, 3, 4);
        line.setEndPoint(new Point(5, 6));
        assertEquals(5, line.getEndPoint().getX());
        assertEquals(6, line.getEndPoint().getY());

        line.setEndPoint(7, 8);
        assertEquals(7, line.getEndPoint().getX());
        assertEquals(8, line.getEndPoint().getY());
    }
}
