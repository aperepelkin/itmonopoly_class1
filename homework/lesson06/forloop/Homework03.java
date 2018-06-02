package homework.lesson06.forloop;
import java.util.Scanner;
public class Homework03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int sum;
        int i;
        int lastValue;

        do{
            i = 1;
            System.out.print("введите число n: ");
            n = scan.nextInt();
            if (n <= 0) {
                System.out.println("число должно быть больше нуля");
                continue;
            }

            lastValue = ((2*n)*(2*n));

            for (sum = n*n; sum <= lastValue ;  )  {
                sum += ((n+i)*(n+i));
                i++;
            }

            System.out.println(sum+lastValue);
        } while (!scan.next().equals("exit"));

    }
}
