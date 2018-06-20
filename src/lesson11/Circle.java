package lesson11;

public class Circle {

    public double radius; // = 8;
    public double x;
    public double y;

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double length() {
        return 2 * Math.PI * this.radius;
    }

    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.printf("Radius: %s, X: %s, Y: %s\n", radius, x, y);
    }

    public double distance(double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }

    public double distance(Circle other) {
        return distance(other.x, other.y);
    }
}
