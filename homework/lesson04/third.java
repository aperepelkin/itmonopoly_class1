package homework.lesson04;
import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        int a, b, c = 0;

        if (args.length >= 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        } else {
            Scanner scan = new Scanner(System.in);
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
        }

        if (a!=b && a!=c && b!=c){
            if (a>b && a>c) {
                if (c>b) {
                    System.out.println("среднее число: " + c);
                } else if (c<b) {
                    System.out.println("среднее число: " + b);
                }
            } else if (b>a && b>c) {
                if (a>c){
                    System.out.println("среднее число: " + a);
                } else if (a<c){
                    System.out.println("среднее число: " + c);
                }
            } else if (c>a && c>b) {
                if (a>b){
                    System.out.println("среднее число: " + a);
                } else if (a<b){
                    System.out.println("среднее число: " + b);
                }
            }
        } else {
            System.out.println("среднего числа нет, среди чисел есть одинаковые");
        }

    }
}
