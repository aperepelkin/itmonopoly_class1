package homework.lesson06.forloop;
import java.util.Scanner;
public class Homework01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int sum;

        do {
            System.out.print("введите число а: ");
            a = scan.nextInt();
            System.out.print("введите число b: ");
            b = scan.nextInt();
            sum = 0;

            if (a < 1 || b <1) {
                System.out.println("числа должны быть больше или равны 1");
                continue;
            }

            for (int i = a; i <= b; i++) {
                sum += i;
            }
            System.out.println("сумма всех чисел от " + a + " до " + b + " составляет " + sum);
        } while (!scan.next().equals("exit"));

    }
}