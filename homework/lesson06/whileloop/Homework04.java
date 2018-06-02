package homework.lesson06.whileloop;
import java.util.Scanner;
public class Homework04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;
        int k;
        int sum;

        do {
            k = 1;
            sum = 1;
            System.out.print("введите число n: ");
            n = scan.nextInt();

            if (n < 1) {
                System.out.println("число должнобыть больше единицы, попробуйте снова");
                continue;
            }

            while (sum < n ) {
                k++;
                sum += k;
            }
            System.out.println("наименьшее число k, при котором сумма чисел от 1 до k больше или равна " + n + ": " + k);
            System.out.println("сумма чисел от 1 до " + k + " равна " + sum);
            System.out.println("введите exit чтобы выйти или любой символ, чтобы продолжить");
        } while (!scan.next().equals("exit"));

    }
}
