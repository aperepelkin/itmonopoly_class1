package lesson07;

import java.util.Random;
import java.util.Scanner;

public class RandomOutput {

    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = rnd.nextInt();
            System.out.printf("Number: %d", number);
            String str = sc.nextLine();
            if(str.toLowerCase().equals("exit"))
                break;
        }
    }
}
