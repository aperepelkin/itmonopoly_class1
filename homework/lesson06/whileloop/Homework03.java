package homework.lesson06.whileloop;
import java.util.Scanner;
public class Homework03 {
    public static void main(String[] args) {
        int n;
        int k = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("введите число n: ");
            n = scan.nextInt();

            if (n == 0) {
                System.out.println("вы ввели ноль, введите другое число");
                continue;
            } else if (n < 0) {
                System.out.println("вы ввели отрицательное число, введите другое");
                continue;
            }

            while ((k*k) <= n) {
                k++;
                if ((k*k) > n) {
                    k--;
                    break;
                }
            }
            System.out.println("наибольшее число k, квадрат которого не превосходит n: " + k);
            System.out.println("введите exit чтобы выйти или любой символ, чтобы продолжить");
        } while (!scan.next().equals("exit"));

    }
}

