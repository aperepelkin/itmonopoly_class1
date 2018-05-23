package lesson04;

import java.util.Scanner;

public class ConsoleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ператор для получения справки");
        System.out.println();
        String input = scanner.next();

        switch (input) {
            case "if": break;
            case "switch": break;
        }
        System.out.println("Entered: " + input);
    }
}
