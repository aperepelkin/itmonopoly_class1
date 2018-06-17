package homework.lesson09;
import java.util.Random;
import java.util.Scanner;
public class Homework05 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int m,n;

        System.out.print("введите количество строк: ");
        m = scan.nextInt();
        System.out.print("введите количество столбцов: ");
        n = scan.nextInt();
        System.out.println();
        int[][] matrix = new int[m][n];
        Random rnd = new Random();

        System.out.println("Базовая матрица:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rnd.nextInt(100);
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Транспонированная матрица:");

        int [][] tMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int tmp = matrix[j][i];
                tMatrix[i][j] = matrix[j][i];
                System.out.printf("%5d", tMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
