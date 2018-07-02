package lesson14.painting;

import lesson11.Point;

public class Main {

    public static void main(String[] args) {
        Painter painter = new ConsolePainter();
        Figure figure = new Square(new Point(0, 0), 200);

        figure.draw(painter);
    }
}
