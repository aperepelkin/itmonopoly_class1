package homework.lesson04;
import java.util.Scanner;
public class fifth {
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
            if (a > b && a > c) {
                cases = 1;
            } else if (b > a && b > c) {
                cases = 2;
            } else if (c > a && c > b) {
                cases = 3;
            }
        } else {
            System.out.println("среднего числа нет, среди трех введенных чисел есть одинаковые");
        }

        switch (cases) {
            case 1:
                if (b > c) {
                    result = a + b;
                    System.out.println("результат суммирования двух наибольших чисел: " + result);
                } else if (b < c) {
                    result = a + c;
                    System.out.println("результат суммирования двух наибольших чисел: " + result);
                }
                break;
            case 2:
                if (a > c) {
                    result = a + b;
                    System.out.println("результат суммирования двух наибольших чисел: " + result);
                } else if (a < c) {
                    result = b + c;
                    System.out.println("результат суммирования двух наибольших чисел: " + result);
                }
                break;
            case 3:
                if (a > b) {
                    result = a + c;
                    System.out.println("результат суммирования двух наибольших чисел: " + result);
                } else if (a < b) {
                    result = b + c;
                    System.out.println("результат суммирования двух наибольших чисел: " + result);
                }
                break;
        }
    }
}

