package lesson03;

/**
 *
 */
public class Integers {
    public static void main(String[] args) {
        int intValue = 4;
        long longValue = Integer.MAX_VALUE + 100L;
        System.out.println(longValue);

        int fromLong = (int) longValue;

        System.out.println(fromLong);
    }
}
