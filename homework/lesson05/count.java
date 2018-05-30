package lesson5;
import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        int i = 0;
        int n;

        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        if (n % 2 != 0) {
            n -= 1;
        }
        while (i != n) {
                i = i+2;
                System.out.println(i);

            }


    }

}
