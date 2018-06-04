package lesson06;

import java.util.Scanner;

public class TestFib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите число:");
            int a = scanner.nextInt();

            int n1 = 1;
            int n2 = 1;
            int fib = n1 + n2;
            while (a > fib) {
                fib = n1 + n2;
                n2 = n1;
                n1 = fib;
            }

            if(a == fib) {
                System.out.println("Является");
            } else {
                System.out.println("Не является");
            }

        } while(!scanner.next().equals("exit"));
    }
}
