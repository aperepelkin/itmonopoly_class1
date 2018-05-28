package lesson04;

import java.util.Scanner;

public class HW04 {
    public static void main(String[] args) {
        int a, b, c;
        if (args.length >= 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        } else {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите числа:");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }

        int max;
        if(a>b) {
            if(a>c) {
                max = a;
            } else {
                max = b;
            }
        } else {
            if(b>c) {
                max = b;
            } else {
                max = c;
            }
        }

        System.out.println(max);
    }
}
