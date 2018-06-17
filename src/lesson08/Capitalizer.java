package lesson08;

import java.util.Scanner;

public class Capitalizer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string");
        String str = scanner.nextLine();
        final String SPACE = " ";

        int count = 0;
        int index = str.indexOf(SPACE);

        while (index != -1) {
            count++;
            index = str.indexOf(SPACE, index + 1);
        }

        String[] words = new String[count + 1];

        index = str.indexOf(SPACE);
        int idx = 0;
        words[idx] = str.substring(0, index);
        while (index != -1) {
            idx++;
            int nextIndex = str.indexOf(SPACE, index + 1);
            if(nextIndex != -1) {
                words[idx] = str.substring(index + SPACE.length(), nextIndex);
            }
            index = nextIndex;
        }
        words[idx] = str.substring(index + 1);

        for(idx = 0; idx < words.length; idx++) {
            String word = words[idx];
            // TODO
//            words[idx] = //capitalized word
        }
    }
}
