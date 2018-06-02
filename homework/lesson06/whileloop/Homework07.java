package homework.lesson06.whileloop;
import java.util.Scanner;
public class Homework07 {
    public static void main(String[] args) {
        int k;
        int value;
        boolean check = true;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("введите число: ");
            value = scan.nextInt();
            k = 1;

            if (value <= 1) {
                System.out.println("введите числе больше единицы");
                continue;
            }

            while (k < value-1) {
                k++;
                if (value % k == 0){
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            System.out.println(check);
        } while (!scan.next().equals("exit"));

    }
}
