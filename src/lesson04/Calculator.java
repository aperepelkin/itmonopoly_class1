package lesson04;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        String op = scanner.next();
        int number2 = scanner.nextInt();
        int result = 0;

        switch (op) {
            case "+": result = number1 + number2;
            break;
            case "-": result = number1 - number2;
            break;
            case "*": result = number1 * number2;
            break;
            case "/": result = number1 / number2;
            break;
            default:
                System.out.println("unknown operation");
        }

        System.out.println("Result: " + result);
    }
}
