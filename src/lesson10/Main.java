package lesson10;

public class Main {
    public static void main(String[] args) {
        Pen red = new Pen("red");
        Pen green = new Pen("green");
        red.print();
        green.print();

        Square sq1 = new Square();
        sq1.size = 3;
        sq1.thickness = 1;
        sq1.color = "red";

        Square sq2 = new Square();
        sq2.size = 30;
        sq2.thickness = 1;
        sq2.color = "green";

        Square sq3 = new Square();
        sq3.size = 44;
        sq3.thickness = 1;
        sq3.color = "yellow";

        sq1.print();
        sq2.print();
        sq3.print();

        int s1 = sq1.square() * 6;
        System.out.println(s1);
    }
}
