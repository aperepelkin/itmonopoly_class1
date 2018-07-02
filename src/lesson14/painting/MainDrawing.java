package lesson14.painting;

import lesson11.Point;

public class MainDrawing extends Drawing {
    @Override
    public void main(Painter painter) {
        Figure figure = new Square(new Point(20, 20), 200);
        figure.draw(painter);
        new Circle(new Point(100, 100), 250).draw(painter);
    }
}
