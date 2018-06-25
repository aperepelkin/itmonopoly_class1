package lesson09;

import com.sun.deploy.util.ArrayUtil;
import utils.ArraysUtils;

import java.util.Random;

public class Maximums {
    public static void main(String[] args) {

        final int m = 8;
        final int n = 5;
        int[][] matrix = new int[m][n];

        System.out.println(matrix.length);

        Random rnd = new Random();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rnd.nextInt(300) - 150;
            }
        }

        for (int[] row : matrix) {
            for (int item : row) {
                System.out.printf("%5d ", item);
            }
            System.out.println();
        }

        int[] maxs = new int[m];

        for (int i = 0; i < m; i++){
            maxs[i] = ArraysUtils.max( matrix[i]);
        }
        System.out.println("Result:");
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.printf("%5d ", item);
            }
            System.out.println();
        }
        System.out.println("Maximums:");
        for (int item : maxs) {
            System.out.print(item + ",");
        }

        for (int i = 0; i < m; i++){
            for (int j = 1; j < n; j+=2) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][j+1];
                matrix[i][j+1] = tmp;
            }
        }
    }
}
