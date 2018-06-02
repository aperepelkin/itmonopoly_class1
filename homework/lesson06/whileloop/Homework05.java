package homework.lesson06.whileloop;
import java.util.Scanner;
public class Homework05 {
    public static void main(String[] args) {
        final float deposit = 1000f;     //amount of deposit
        float percent;                  //deposit rate
        float s;                        //approximated amount of deposit after K months
        int k;                          //months
        Scanner scan = new Scanner(System.in);

        do {
            k = 0;
            s = deposit;
            System.out.print("введите процент депозита (больше ноля и более 25: ");
            percent = scan.nextFloat();

            if (percent <= 0) {
                System.out.println("процент не может быть отрицательным или равным нулю");
                continue;
            } else if (percent > 25) {
                System.out.println("процент не может быть более 25");
                continue;
            }

            while (s < 1100) {
                s = (s + ((s/100) * percent));
                k++;
            }
            System.out.println("При " + percent + "% вклад будет составлять " + s + " рубля через " + k + " месяцев");
            System.out.println("введите exit чтобы выйти или любой символ, чтобы продолжить");
        } while (!scan.next().equals("exit"));

    }
}
