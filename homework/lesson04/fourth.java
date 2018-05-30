package homework.lesson04;
import java.util.Scanner;
public class fourth {
    public static void main(String[] args) {
        int a,b,c = 0;

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
            if (a<b && a<c) {
                System.out.println("наименьшее число: " + a);
                if (b>c){
                    System.out.println("наибольшее чсило: " + b);
                } else if (b<c){
                    System.out.println("наибольшее число: " + c);
                }
            } else if (b<a && b<c){
                System.out.println("наименьшее число: " + b);
                if (a>c){
                    System.out.println("наибольшее число: " + a);
                } else if (a<c) {
                    System.out.println("наибольшее число: " + c);
                }
            } else if (c<a && c<b){
                System.out.println("наименьшее число: " + c);
                if (b>a) {
                    System.out.println("наибольшее число: " + b);
                } else if (b<a) {
                    System.out.println("наибольшее число: " + a);
                }
            }
        } else {
            System.out.println("среднего числа нет, среди трех введенных чисел есть одинаковые");
        }
    }
}
