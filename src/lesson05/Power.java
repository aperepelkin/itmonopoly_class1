package lesson05;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do{


            System.out.println("Введите число:");
           int a = scanner.nextInt();


        if (a % 2 == 0)
            System.out.println("Является");

        else
            System.out.println("Не является");
            System.out.println("Введите exit для выхода");

        }while (true);
    }
}
