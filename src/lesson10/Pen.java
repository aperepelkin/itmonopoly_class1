package lesson10;

public class Pen {
    public String color;
    public int thickness;

    public Pen(String c) {
        color = c;
    }

    public void print() {
        System.out.println("Color: " + color);
    }
}
