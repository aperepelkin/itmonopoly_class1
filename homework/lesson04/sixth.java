package homework.lesson04;
import java.util.Scanner;
public class sixth {
    public static void main(String[] args) {
        int a, b, c, result = 0;
        int cases = 0;

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

        if (a != b && a != c && b != c) {
            if (a < b && a < c) {
                cases = 1;
            } else if (b < a && b < c) {
                cases = 2;
            } else if (c < a && c < b) {
                cases = 3;
            }
        } else {
            System.out.println("среднего числа нет, среди трех введенных чисел есть одинаковые");
        }

        System.out.println("");

        switch (cases) {
            case 1:
                System.out.println(a);
                if (b<c) {
                    System.out.println(b);
                    System.out.println(c);
                } else if (b>c) {
                    System.out.println(c);
                    System.out.println(b);
                }
                break;
            case 2:
                System.out.println(b);
                if (a<c) {
                    System.out.println(a);
                    System.out.println(c);
                } else if (a>c){
                    System.out.println(c);
                    System.out.println(a);
                }
                break;
            case 3:
                System.out.println(c);
                if (a<b) {
                    System.out.println(a);
                    System.out.println(b);
                }else if (a>b) {
                    System.out.println(b);
                    System.out.println(c);
                }
                break;
        }
    }
}
