package lesson14.painting;

import lesson11.Point;

public class MainDrawing extends Drawing {
    @Override
    public void main(Painter painter) {
        Figure figure = new Square(new Point(0, 0), 200);
        figure.draw(painter);
    }
}
