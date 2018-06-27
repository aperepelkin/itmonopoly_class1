package lesson13.interfaces;


import java.util.Arrays;

public class CrazyPrinter implements Printer {
    @Override
    public void print(Object obj) {
        String str = obj.toString();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(new String(chars));
    }
}
