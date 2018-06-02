package homework.lesson06.whileloop;
import java.util.Scanner;
public class Homework01 {

    public static void main(String[] args) {
        int n;
        int power;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("введите число: ");
            n = scan.nextInt();

            if (n == 0) {
                System.out.println("вводить ноль нельзя, попробуйте снова или выйдете из программы, написав exit или любой символ, чтобы продолжить");
                continue;
            }

            power = 1;
            do {
                if (n % 2 != 0) {
                    System.out.println("введенное число не является степенью двойки");
                    break;
                }
                n /= 2;
                power++;
            } while (n != 2);

            if (n == 2) {
                System.out.println("показатель степени двойки введенного числа: " + power);
            }
            System.out.println("введите exit чтобы выйти или любой символ, чтобы продолжить");
        } while (!scan.next().equals("exit"));

    }
}
