package homework.lesson09;
import java.util.Random;
import java.util.Scanner;
public class Homework01 {
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

        System.out.println();

        for (int i = 0; i < m; i++) {
            boolean [] isSorted = new boolean[n];           //массив истинности (для проверки: меняли ли мы конкретный элемент или нет

            for (int j = 0; j < n; j++) {
                if (j == n-2){                              //если мы на предпоследнем элементе, тогда печатаем его и печатаем последний и выходим
                    System.out.printf("%5d", matrix[i][j]);
                    System.out.printf("%5d", matrix[i][j+1]);
                    break;
                }

                if (isSorted[j] == false) {                 // проверяем, сортировали ли этот j элемент или нет
                    int tmp = matrix[i][j];                 // временная переменная для хранения matrix[i][j] элемента
                    matrix[i][j] = matrix[i][j+2];
                    matrix[i][j+2] = tmp;
                    isSorted[j] = true;                     // отмечаем, что отсортировали j и j+2 элементы между собой
                    isSorted[j+2] = true;                   //
                }

                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
