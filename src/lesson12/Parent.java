package lesson12;

public class Parent {

    int fld = 2; // 1.
    private int privateField = 2;
    protected int protectedField = 2;
    public int publicField = 2; // 1.

    {
        System.out.println("Init Parent " + fld); // 2.
    }

    public Parent() {
        System.out.println("Parent"); // 3.
    }

    public Parent(int s) {
        this();
        fld = s;
    }
}
