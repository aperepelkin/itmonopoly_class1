package lesson12;

public class Circle extends Shape {

    private double R;

    public Circle(double r) {
        R = r;
    }

    @Override
    protected double square() {
        return Math.PI * Math.pow(R, 2);
    }

    public static void main(String[] args) {
        new Circle(7).printSquare();
    }

    public double getR() {
        return R;
    }

    @Override
    public String toString() {

        return super.toString() + " I am Circle with radius " + R ;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj == null )
            return false;
        if (obj instanceof Circle) {
            return ((Circle) obj).R == R;
        } else
            return false;
    }
}
