package lesson09;

import java.util.Random;

public class Matrix {

    public static void main(String[] args) {

        int[][] matrix = new int[8][5];

        System.out.println(matrix.length);

        Random rnd = new Random();
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = rnd.nextInt(300) - 150;
            }
        }

        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + ",");
            }
            System.out.println();
        }

        System.out.println();
        int[][] rows = new int[5][];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new int[5 + i];
            for (int j = 0; j<rows[i].length; j++) {
                rows[i][j] = rnd.nextInt(200);
            }
        }

        for (int[] row : rows) {
            for (int item : row) {
                System.out.print(item + ",");
            }
            System.out.println();
        }
    }
}
