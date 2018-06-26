package lesson09;

public class Printer {

    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + ",");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (double[] row : matrix) {
            for (double item : row) {
                System.out.printf("%f, ", item);
            }
            System.out.println();
        }
    }


}
