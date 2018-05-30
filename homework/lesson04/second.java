package homework.lesson04;
import java.util.Scanner;
public class second {
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

        if (a > b) {
            System.out.println("большее число: " + a);
            System.out.println("меньшее число: " + b);
        } else if (a <  b) {
            System.out.println("большее число: " + b);
            System.out.println("меньшее число: " + a);
        } else {
            System.out.println("числа равны");
        }
    }
}
