package lesson14.painting;

import lesson11.Point;

public class Main {

    public static void main(String[] args) {
        Painter painter = new ConsolePainter() {
            @Override
            public void drawline(Point from, Point to) {
                System.out.print("[MAIN]");
                super.drawline(from, to);
            }

            @Override
            public void drawCircle(Point center, double radius) {
                System.out.print("[MAIN]");
                super.drawCircle(center, radius);
            }
        };
        Figure figure = new Square(new Point(0, 0), 200);

        figure.draw(painter);
    }
}
