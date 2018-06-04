package lesson07;

import java.util.Random;

public class Strings {
    public static void main(String[] args) {
        String str1 = "String1";
        String str2 = new String();
        String str3 = new String(str1);
        String str4 = str1;
        String str5 = "String1";
        String str6 = new String(new char[]{'s', 't', 'r'});

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
        System.out.println("str5: " + str5);
        System.out.println("str1 == str3: " + (str1.equals(str3)) );
        System.out.println("str1 == str4: " + (str1.equals(str4)) );


        System.out.println("str: " + (5 + 6));
        System.out.println(5 + 6 + "str: ");

        System.out.println("UPPER: " + str6.toUpperCase());
        str6 = str6.toUpperCase();
        System.out.println("str6: " + str6);

        Math.random();
        Random rnd = new Random();
        rnd.nextInt(100);

    }
}
