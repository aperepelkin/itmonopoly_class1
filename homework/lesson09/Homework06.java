package homework.lesson09;
import java.util.Random;
import java.util.Scanner;
public class Homework06 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n;

        System.out.print("введите количество столбцов/строк матрицы: ");
        n = scan.nextInt();
        int[][] matrix = new int[n][n];
        Random rnd = new Random();

        System.out.println("Базовая матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rnd.nextInt(n*n);
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Зеркально отраженная матрица по диагонали:");

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[(n-1)-j][(n-1)-i];
                matrix[(n-1)-j][(n-1)-i] = tmp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < n; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
