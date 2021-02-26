package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int maxSum = 0;
        int maxArray = 0;
        int n = 8;
        int m = 12;
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                array[i][j] = rand.nextInt(50);

            }
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
                sum += array[i][j];

            }
            if (sum > maxSum) {
                maxSum = sum;
                maxArray = i;
            }

            System.out.print("Сумма элементов ряда: " + sum);
            System.out.println();
        }
        System.out.println("Ответ: " + maxArray);

    }
}
