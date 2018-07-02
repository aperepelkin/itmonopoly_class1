package lesson14.painting;

import lesson11.Point;

public class Circle implements Figure {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void draw(Painter painter) {
        painter.drawCircle(center, radius);
    }
}
