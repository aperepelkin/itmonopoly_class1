package lesson06;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        do {


            System.out.println("Введите число:");
            int a = scanner.nextInt();

            int prev = 1;
            int fib = 1;


            while (a > fib) {
                int tmp = fib;
                fib = fib + prev;
                prev = tmp;

            }

            if (a == fib) {
                System.out.println("Является");
            } else {
                System.out.println("Не является");

            }


        }while(!scanner.nextLine().equals("Exit"));

    }
}





