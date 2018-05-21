package lesson03;

public class Conditions {
    public static void main(String[] args) {
        boolean boolValue;

        int a = -20;
        int b = -30;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);
        System.out.println(a == b);
        System.out.println();

        boolean b1 = a < 0 || ++b > 0 ^ b + 6 > 8;

        System.out.println(b1);
        System.out.println(b);
    }
}
