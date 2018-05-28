package lesson04;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        int a;
        if (args.length > 0) {
            a = Integer.parseInt(args[0]);
        } else {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите число:");
            a = scanner.nextInt();
        }

        if (a % 2 == 0)
            System.out.println("Четное");
        else
            System.out.println("Нечетное");
    }
}
