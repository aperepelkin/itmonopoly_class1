package lesson11;

public class Triangle {

    private Point vertex1;
    private Point vertex2;
    private Point vertex3;

    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    public void setVertex1(Point vertex1) {
        if(!vertex1.inOneLineWith(vertex2, vertex3))
            this.vertex1 = vertex1;
    }

    public void print() {

        System.out.printf("Side 1: %f", vertex1.distance(vertex2));
        System.out.printf("Side 2: %f", vertex2.distance(vertex3));
        System.out.printf("Side 3: %f", vertex3.distance(vertex1));

        vertex1.print();
        vertex2.print();
        vertex3.print();
    }
}
