package lesson06.hw;

public class HW2_6 {
    public static void main(String[] args) {
        int N = 7;
        double A = 5.7512;
        double B = 97.712;

        double H = (B - A) / N;
        System.out.println("H=" + H);
        for(double point = A; Math.abs(B - point) > 0.00001; point += H) {
            System.out.println(point);
            System.out.println(1 - Math.sin(point));
        }
    }
}
