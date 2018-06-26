package lesson11;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(7));
    }

    private static int factorial(int n) {
        if(n == 1)
            return 1;
        return n * factorial(n-1);
    }
}
