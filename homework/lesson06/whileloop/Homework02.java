package homework.lesson06.whileloop;
import java.util.Scanner;
public class Homework02 {

    public static void main(String[] args) {
        int value;
        float fact;
        float start;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("введите число для вычисления двойного факториала: ");
            value = scan.nextInt();

            if (value == 2) {
                System.out.println("факториал равен двум");
                continue;
            } else if (value == 0) {
                System.out.println("введен ноль");
                continue;
            } else if (value < 0) {
                System.out.println("вы ввели отрицательное число");
                continue;
            } else if (value == 1) {
                System.out.println("факториал равен единице");
                continue;
            }

            if (value % 2 == 0) {
                start = 2;
                fact = 2;
                do {
                    fact *= start+2;
                    start = start+2;
                    System.out.println(fact);
                } while (start != value);
            } else if (value % 2 != 0) {
                start = 1;
                fact = 1;
                do {
                    fact *= start+2;
                    start = start+2;
                    System.out.println(fact);
                } while (start != value);
            }
            System.out.println("введите exit чтобы выйти или любой символ, чтобы продолжить");
        } while (!scan.next().equals("exit"));

    }
}
