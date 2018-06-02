package homework.lesson06.whileloop;
import java.util.Scanner;
public class Homework06 {
    public static void main(String[] args) {
        int value;
        boolean two = false;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("введите число: ");
            value = scan.nextInt();
            if (value < 0) {
                System.out.println("введите положительное число");
                continue;
            }

            while (value != 0 && two == false) {
                if (value % 10 != 2) {
                    value = value/10;
                } else
                    two = true;
            }
            System.out.println(two);
        } while (!scan.next().equals("exit"));

    }
}
