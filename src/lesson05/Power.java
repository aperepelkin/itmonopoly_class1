package lesson05;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do{


            System.out.println("Введите число:");
           int a = scanner.nextInt();


<<<<<<< HEAD
        if (a % 2 == 0)
            System.out.println("Является");

        else
=======
        int count = 1;
        while (a % 2 == 0) {
            a /= 2; // a = a / 2;
            count++; // count = count + 1;
        }
        if(a == 1) {
            System.out.println("Является");
            System.out.println("Степень " + count);
        } else {
>>>>>>> master
            System.out.println("Не является");
            System.out.println("Введите exit для выхода");

        }while (true);
    }
}
