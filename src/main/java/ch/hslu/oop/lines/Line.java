package ch.hslu.oop.lines;

public class Line {
    private Point startPoint;
    private Point endPoint;

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

    public void setStartPoint(final Point point) {
        this.startPoint = point;
    }

    public void setStartPoint(final int x, final int y) {
        this.setStartPoint(new Point(x, y));
    }

    public void setEndPoint(final Point point) {
        this.endPoint = point;
    }

    public void setEndPoint(final int x, final int y) {
        this.setEndPoint(new Point(x, y));
    }
}
