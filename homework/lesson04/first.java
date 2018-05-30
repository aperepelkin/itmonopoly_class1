package homework.lesson04;
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        if (args.length >= 2) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } else {
            Scanner scan = new Scanner(System.in);
            a = scan.nextInt();
            b = scan.nextInt();
        }

        if (a>b) {
            System.out.println("число 1 больше");
        } else if (a <b) {
            System.out.println("число 2 больше");
        } else if (a ==b) {
            System.out.println("числа 1 и 2 равны");
        }
    }
}
