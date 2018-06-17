package homework.lesson09;
import java.util.Random;
import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int m,n;
        int m2,n2;
        System.out.println("количество столбцов первой матрицы должно быть равно количеству строк второй!");
        System.out.print("введите количество строк первой матрицы: ");
        m = scan.nextInt();
        System.out.print("введите количество столбцов первой матрицы: ");
        n = scan.nextInt();

        System.out.print("введите количество строк второй матрицы: ");
        m2 = scan.nextInt();
        System.out.print("введите количество столбцов второй матрицы: ");
        n2 = scan.nextInt();

        if (n != m2) {
            System.out.println("перемножение матриц невозможно, количество столбцов первой матрицы должно быть равно количеству строк второй!");
        } else {
            System.out.println();


            int [][] matrix = new int[m][n];
            int [][] matrix2 = new int [m2][n2];

            System.out.println("первая матрица:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = rand.nextInt(3);
                    System.out.printf("%5d", matrix[i][j]);
                }
                System.out.println();
            }


            System.out.println();
            System.out.println("вторая матрица:");

            for (int i = 0; i < m2; i++) {
                for (int j = 0; j < n2; j++) {
                    matrix2[i][j] = rand.nextInt(3);
                    System.out.printf("%5d", matrix2[i][j]);
                }
                System.out.println();
            }

            System.out.println();


            int [][] multipliedMatrix = new int[m][n2];
            System.out.println("результат умножения двух матриц:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n2; j++) {
                    for (int k = 0; k < m2; k++) {
                        int multiply = matrix[i][k] * matrix2 [k][j];
                        multipliedMatrix[i][j]  += multiply;
                    }

                    System.out.printf("%5d", multipliedMatrix[i][j]);
                }
                System.out.println();
            }
        }
    }
}
