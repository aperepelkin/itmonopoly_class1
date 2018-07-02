package lesson14.painting;

import lesson11.Point;

public class ConsolePainter implements Painter {
    @Override
    public void drawline(Point from, Point to) {
        System.out.printf("Draw line from %s to %s\n", from, to);
    }
}
