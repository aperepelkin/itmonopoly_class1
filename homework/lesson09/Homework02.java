package homework.lesson09;
import java.util.Random;
import java.util.Scanner;
public class Homework02 {
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
                matrix[i][j] = rnd.nextInt(300) - 150;
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        boolean [] isSorted = new boolean[m];     //массив истинности (для проверки: меняли ли мы конкретный элемент или нет

        for (int i = 0; i < m-1; i++) {

            if (isSorted[i] == false) {
                for (int j = 0; j < n; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix [i+1][j];
                    matrix[i+1][j] = tmp;
                }
                isSorted[i] = true;
                isSorted[i+1] = true;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }

    }
}
