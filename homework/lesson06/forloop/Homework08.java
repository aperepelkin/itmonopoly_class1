package homework.lesson06.forloop;
import java.util.Scanner;
public class Homework08 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("введите число a: ");
            a = scan.nextInt();
            System.out.print("введите число b: ");
            b = scan.nextInt();

            if (a >= b) {
                System.out.println("число a должно быть меньше b");
                continue;
            } else if (a < 1 || b < 1) {
                System.out.println("числа a и b должны быть больше единицы");
                continue;
            }

            for (int i = a; i <= b; i++) {
                for (int j = a; j < i; j++) {
                    System.out.print(i + " ");
                }
            }
        } while (!scan.next().equals("exit"));

    }
}
