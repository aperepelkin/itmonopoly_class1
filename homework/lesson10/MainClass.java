package homework.lesson10;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String task;
        Car renault = new Car("Renault", "Logan", "red", 5, false, 2.0);

        do {
            System.out.println("введите info, чтобы получить информацию по авто или go, чтобы поехать");
            task = scan.nextLine();
            if (task.equals("info")) {
                renault.getInfo();
            } else if (task.equals("go")) {
                int meters;
                System.out.println("сколько метров будем ехать?");
                meters = scan.nextInt();
                renault.driveForward(meters);
                renault.findOutMileage();
                System.out.println();
            }
        } while (!scan.nextLine().equals("exit"));
    }
}
