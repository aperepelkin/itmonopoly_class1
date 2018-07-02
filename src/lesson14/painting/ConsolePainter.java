package lesson14.painting;

import lesson11.Point;

public class ConsolePainter implements Painter {
    @Override
    public void drawline(Point from, Point to) {
        System.out.printf("Draw line from %s to %s\n", from, to);
    }

    @Override
    public void drawCircle(Point center, double radius) {
        System.out.printf("Draw circle with center %s and radius %s\n", center, radius);
    }
}
