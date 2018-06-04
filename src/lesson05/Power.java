package lesson05;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int a;
        if (args.length > 0) {
            a = Integer.parseInt(args[0]);
        } else {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите число:");
            a = scanner.nextInt();
        }

        int count = 1;
        while (a % 2 == 0) {
            a /= 2; // a = a / 2;
            count++; // count = count + 1;
        }
        if(a == 1) {
            System.out.println("Является");
            System.out.println("Степень " + count);
        } else {
            System.out.println("Не является");
        }
    }
}
