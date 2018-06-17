package homework.lesson09;
import java.util.Random;
import java.util.Scanner;
public class Homework03 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int m,n;

        System.out.print("введите количество строк: ");
        m = scan.nextInt();
        System.out.print("введите количество столбцов: ");
        n = scan.nextInt();
        int[][] matrix = new int[m][n];
        Random rnd = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rnd.nextInt(100);
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }

        int [] sumArray = new int[m];         //массив сумм строк

        for (int i = 0; i <m; i++) {
            int sum = 0;

            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }

            sumArray[i] = sum;
        }

        System.out.println();

        for (int i = 0; i < sumArray.length; i++) {
            System.out.println("сумма чисел " + (i+1) + " строки: " + sumArray[i]);

        }


        int maxStringValue = 0;
        int index = 0;
        for (int i = 0; i < sumArray.length; i++) {
            if (sumArray[i] > maxStringValue) {
                maxStringValue = sumArray[i];
                index = i;
            }
        }

        System.out.println();
        System.out.println("индекс строки с максимальной суммой значений: " + index);

    }
}
