package lesson06.hw;

public class HW2_5 {
    public static void main(String[] args) {
        double X = Math.PI;
        long N = 6;

        double sin = X;
        for(int i = 1; i <= N; i++) {
            System.out.println("N=" + i);
            long factorial = 1;
            int currentN = 2 * i + 1;
            System.out.println("current N=" + currentN);
            for(long j = factorial; j <= currentN; j++) {
                factorial *= j;
            }
            System.out.println("Factorial=" + factorial);
            double powX = 1;
            for(int j = 0; j < currentN; j++)
                powX *=X;
            System.out.println("Power=" + powX);
            double result = powX / factorial;
            if(i % 2 != 0)
                result *=-1;
            System.out.println("Result=" + result);
            sin +=result;
        }

        System.out.println("Sin: " + sin);

        System.out.println("Sin from lib: " + Math.sin(X));
    }
}
