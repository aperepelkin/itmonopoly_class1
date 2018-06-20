package lesson11;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(33, 5,5);
        c1.print();
        Circle c2 = new Circle(33, 17,42);
        c2.print();
        System.out.printf("Distance: %f", c1.distance(c2));

        Point p1 = new Point(1,2);
        Triangle t = new Triangle(
                p1,
                new Point(2,3),
                new Point(3,4));
        t.print();
    }
}
