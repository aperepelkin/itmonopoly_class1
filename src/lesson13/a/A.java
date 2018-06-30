package lesson13.a;

public class A {

    public static int field = 22;
    public static final int constField = 122;

    public A () {
        this("default");
        System.out.println("Class lesson13.a.A");

    }

    A (String str) {
        new B("from A");
        System.out.println(str);
    }
}
