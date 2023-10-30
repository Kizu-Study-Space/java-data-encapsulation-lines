package ch.hslu.oop.lines;

public class Point {
    private final int x;
    private final int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public Point moveRelative(final int x, final int y) {
        return new Point(this.x + x, this.y + y);
    }

    public Point moveRelative(final Point point) {
        return this.moveRelative(point.getX(), point.getY());
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
