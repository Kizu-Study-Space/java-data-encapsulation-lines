package ch.hslu.oop.lines;

public class Line {
    private final Point startPoint;
    private final Point endPoint;

    public Line(final int x1, final int y1, final int x2, final int y2) {
        startPoint = new Point(x1, y1);
        endPoint = new Point(x2, y2);
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }
}
