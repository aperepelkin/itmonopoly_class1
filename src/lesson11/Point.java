package lesson11;

public class Point {

    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point other) {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }

    public void print() {

    }

    public boolean inOneLineWith(Point p1, Point p2) {
        return false;
    }

    public static boolean inOneLineWith(Point p1, Point p2, Point p3) {
        return p1.inOneLineWith(p2, p3);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
