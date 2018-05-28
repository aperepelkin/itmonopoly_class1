package lesson04;

import java.util.Scanner;

public class дз1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        System.out.println("------------");

///вывести порядковый номер меньшего из чисел
        if (number1 < number2)
            System.out.println("1");
        else if (number2 < number1)
            System.out.println("2");
        else System.out.println("give not egual numbers");

        System.out.println("------------");

///вывести в начале большее затем меньшее
        if (number1 < number2)
            System.out.print(number2 + " " + number1 + "\n");
        else if (number2 < number1)
            System.out.print(number1 + " " + number2 + "\n");
        else System.out.println("give not egual numbers");

        System.out.println("------------");

///найти среднее из чисел
        if (number1 < number2 && number2 < number3)
            System.out.print(number2 + "\n");
        else if (number1 > number2 && number2 > number3)
            System.out.print(number2 + "\n");
        else if (number2 < number1 && number1 < number3)
            System.out.print(number1 + "\n");
        else if (number2 > number1 && number1 > number3)
            System.out.print(number1 + "\n");
        else if (number2 < number3 && number3 < number1)
            System.out.print(number3 + "\n");
        else if (number2 > number3 && number3 > number1)
            System.out.print(number3 + "\n");
        else System.out.println("give not egual numbers");

        System.out.println("------------");

///вывести вначале еньшее потом большее
        if (number1 < number2)
            System.out.print(number1 + " " + number2 + "\n");
        else if (number2 < number1)
            System.out.print(number2 + " " + number1 + "\n");
        else System.out.println("give not egual numbers");

        System.out.println("------------");

/// найти сумму двух наибольших
        if (number2 > number1 && number2 > number3) {
            if (number1 > number3)
                System.out.print(number2 + number1 + "\n");
            else
                System.out.print(number2 + number3 + "\n");
        }
        else if (number1 > number2 && number1 > number3) {
            if (number2 > number3)
                System.out.print(number2 + number1 + "\n");
            else
                System.out.print(number3 + number1 + "\n");
        }
        else if (number3 > number2 && number3 > number1) {
            if (number2 > number1)
                System.out.print(number2 + number3 + "\n");
            else
                System.out.print(number1 + number3 + "\n");
        }
        System.out.println("------------");

///вывести числа в порядке возрастания
         if (number1 < number2 && number1 < number3) {
            if (number2< number3)
                System.out.print(number1 + "," + number2 + "," +  number3 + "\n");
            else
                System.out.print(number1 + "," + number3 + "," + number2 + "\n");
        }
         if (number2 < number1 && number2 < number3) {
            if (number1 < number3)
                System.out.print(number2 + "," + number1 + "," +  number3 + "\n");
            else
                System.out.print(number2 + "," + number3 + "," +  number1 + "\n");
        }
         if (number3 < number1 && number3 < number2) {
            if (number1 < number2)
                System.out.print(number3 + "," + number1 + "," +  number2 + "\n");
            else
                System.out.print(number3 + "," + number2 + "," +  number1 + "\n");



        }

    }
}
