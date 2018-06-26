package lesson12;

public class Shape {

    protected double square() {
        return -1;
    }

    public void printSquare() {
        System.out.println("Shape with square: " + square());
    }

    @Override
    public String toString() {
        return "Shape";
    }
}
