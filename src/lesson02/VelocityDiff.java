package lesson02;


public class VelocityDiff {
    public static void main(String[] args) {
        int v1 = 76;
        int v2 = 96;
        final int hours = 5;
        int s1 = v1 * hours;
        int s2 = v2 * hours;
        int d = s2 - s1;
        if(d < 0)
            d = d * -1;
        System.out.println(d);
    }
}
