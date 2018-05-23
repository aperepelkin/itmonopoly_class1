package lesson04;

public class SignSum {
    public static void main(String[] args) {
        if (args.length >= 3) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);

            int plus = 0;

            if(a >= 0) plus++; // plus = plus + 1 // plus += 1
            if(b >= 0) plus++;
            if(c >= 0) plus++;

            System.out.println("Положительных " + plus);
            System.out.println("Отрицательных " + (3 - plus));
        } else {
            System.out.println("введите 3 числа");
        }
    }
}
