package lesson12;

public class Overrides {

    public static void main(String[] args) {
        Shape s = new Shape();
        Shape c = new Circle(8);
        s.printSquare();
        c.printSquare();
        Circle cc = (Circle) c;
        cc.getR();
        System.out.println(cc);
        System.out.println(s);
    }
}
