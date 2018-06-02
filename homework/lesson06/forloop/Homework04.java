package homework.lesson06.forloop;
import java.util.Scanner;
public class Homework04 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        int sqr;

        do {
            System.out.print("введите, квадрат которого вы хотите посчитать: ");
            n = scan.nextInt();

            if (n < 1) {
                System.out.println("число должно быть больше или равно единице");
                continue;
            }
            sqr = 0;

            for (int i = 1; i <= ((2*n)-1); ) {
                sqr += i;
                System.out.println(sqr);
                i += 2;
            }
        } while (!scan.next().equals("exit"));

    }
}
