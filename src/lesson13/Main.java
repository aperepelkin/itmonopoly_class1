package lesson13;

import lesson13.a.A;
import lesson13.a.B;

import static lesson13.a.A.field;

public class Main {

    static int field = 7;

    public static void main(String[] args) {

        new A();
        new lesson13.A();
        new B();
        field = 6;
        System.out.println(field);
    }
}
