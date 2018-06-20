package lesson10;

public class Square {
    public String color;
    public int thickness;
    public int size;

    public void print() {
        if(size == 0)
            return;
        System.out.println("Color: " + color);
        System.out.println("Thickness: " + thickness);
        System.out.println("Size: " + size);
    }

    public int square() {
        if(size == 0)
            return -1;
        int square = size * size;
        return square; // return size * size;
    }

    public Square reduce() {
        Square s = new Square();
        s.size = size/2;
        s.color = color;
        s.thickness = thickness;
        return s;
    }
}
