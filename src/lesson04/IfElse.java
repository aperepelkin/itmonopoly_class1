package lesson04;

public class IfElse {

    public static void main(String[] args) {

        if (args.length > 0) {
            int a = Integer.parseInt(args[0]);

            if (a % 2 == 0)
                System.out.println("Четное");
            else
                System.out.println("Нечетное");
        } else {
            System.out.println("Число не задано");
        }
    }
}
