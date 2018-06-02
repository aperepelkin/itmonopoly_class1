package homework.lesson06.forloop;
import java.util.Scanner;
public class Homework07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        int ak;
        int n;

        do {
            System.out.print("введите число n: ");
            n = scan.nextInt();

            if (n < 2) {
                System.out.println("число должно быть больше или равно двум");
                continue;
            }

            System.out.print(a1 + " " + a2 + " " + a3 + " ");

            for (int k = 4; k <= n; k++ ) {
                ak = a3 + a2 - 2*a1;
                a1 = a2;
                a2 = a3;
                a3 = ak;
                System.out.print(ak + " ");
            }
        } while (!scan.next().equals("exit"));

    }
}
