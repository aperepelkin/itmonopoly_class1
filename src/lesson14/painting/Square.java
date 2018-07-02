package lesson14.painting;

import lesson11.Point;

public class Square implements Figure {

    private Point point;
    private double length;

    public Square(Point point, double length) {
        this.point = point;
        this.length = length;
    }

    @Override
    public void draw(Painter painter) {
        Point topLeft = new Point(point.getX(), point.getY() + length);
        Point topRight = new Point(point.getX() + length, point.getY() + length);
        Point bottomRight = new Point(point.getX() + length, point.getY());

        painter.drawline(point, topLeft);
        painter.drawline(topLeft, topRight);
        painter.drawline(topRight, bottomRight);
        painter.drawline(bottomRight, point);
    }
}
