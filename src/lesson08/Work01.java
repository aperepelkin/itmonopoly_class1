package lesson08;

import java.util.Scanner;

public class Work01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string");
        String str = scanner.nextLine();
        System.out.println("Enter substring");
        String substr = scanner.nextLine();

        int count = 0;
        int index = str.indexOf(substr);

        while (index != -1) {
            count++;
            int nextIndex = str.indexOf(substr, index + 1);
            if(nextIndex != -1) {
                String excludes = str.substring(index + substr.length(), nextIndex);
                System.out.println(excludes);
            }
            index = nextIndex;
        }

        System.out.println("Count: " + count);
    }
}
