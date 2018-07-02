package lesson14.painting;

import lesson11.Point;

// TODO нужно с помощью данного интерфейса сделать рисование квадрата
// TODO сделать текстовую реализацию данного интерфейса, 
// т.е. при попытки нарисовать линию просто выводим на экран линия из точки ... в точку ... 
public interface Painter {
	// служит для отрисовки линий
	void drawline(Point from, Point to);
	default void clear() {
		System.out.println("Do nothing");
	}
}
