package lesson03;

public class Doubles {
    public static void main(String[] args) {
        double doubleValue = 5.8;
        float floatValue = 5.8f;

        double fromFloat = floatValue;
        float fromDouble = (float) doubleValue;

        System.out.println(fromDouble);


        doubleValue = Double.MAX_VALUE / 2;
        System.out.println(doubleValue);
        fromDouble = (float) doubleValue;

        System.out.println(fromDouble);
    }
}
