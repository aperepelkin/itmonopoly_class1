package homework.lesson08;
import java.util.Scanner;
public class Homework01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        str1 = str1.replaceAll("\\s+", "");
        str2 = str2.replaceAll("\\s+", "");
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println(false);
        } else {

            char [] ch1 = str1.toCharArray();
            char [] ch2 = str2.toCharArray();

            for(int j = ch1.length -1; j > 0; j-- ) {
                for (int i = 0; i < j; i++) {
                    if (ch1[i] > ch1[i+1]) {
                        char tmp = ch1[i];
                        ch1[i] = ch1[i+1];
                        ch1[i+1] = tmp;
                    }
                }
            }


            for (int j = ch2.length - 1; j > 0; j--) {
                for(int i = 0; i < j; i++) {
                    if (ch2[i] > ch2[i+1]) {
                        char tmp = ch2[i];
                        ch2[i] = ch2[i+1];
                        ch2[i+1] = tmp;
                    }
                }
            }

            String st1 = new String(ch1);
            String st2 = new String(ch2);

            System.out.println(st1.equals(st2));
        }

    }
}
