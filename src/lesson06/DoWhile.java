package lesson06;

<<<<<<< HEAD

public class DoWhile {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        for (int i = a ; i <= b; i++) {
            System.out.println(i);


        }


    }
}
=======
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите число:");
            int a = scanner.nextInt();

            if(a == 13)
                continue;

            if (a % 2 == 0)
                System.out.println("Четное");
            else
                System.out.println("Нечетное");

            System.out.println("Введите exit для выхода");

            if(scanner.next().equals("exit"))
                break;

//        } while(!scanner.next().equals("exit"));
          } while(true);
    }
}
>>>>>>> master
