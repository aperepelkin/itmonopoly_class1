package utils;

import org.jetbrains.annotations.Contract;

import java.util.Random;

public class ArraysUtils {

    public static int[][] createMatrix(int m, int n, int from, int to) {
        int[][] matrix = new int[m][n];
        Random rnd = new Random();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rnd.nextInt(from + to) - to;
            }
        }
        return matrix;
    }

    public static int[][] createMatrix(int m, int n, int bound) {
        return createMatrix(m, n, 0, bound);
    }

    public static int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
//        if(n1 > n2)
//            return n1;
//        else
//            return n2;
    }

    public static double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    public static int max(int... array) {
        int max = array[0];
        for (int i = 1; i<array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }
}
