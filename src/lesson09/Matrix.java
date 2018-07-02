package lesson09;

import java.util.Random;

public class Matrix {

    int n = 1;
    int m = 3;

    public static void main(String[] args) {

        int[][] matrix = new int[8][5];

        System.out.println(matrix.length);

        Random rnd = new Random();
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = rnd.nextInt(300) - 150;
            }
        }

        Printer.print(matrix);

        System.out.println();
        int[][] rows = new int[5][];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new int[5 + i];
            for (int j = 0; j<rows[i].length; j++) {
                rows[i][j] = rnd.nextInt(200);
            }
        }

        Printer.print(matrix);
    }
}
