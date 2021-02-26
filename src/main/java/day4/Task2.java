package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] mas = new int[100];
        for (int i = 0; i < 100; i++) {
            mas[i] = rand.nextInt(10000);
        }
        System.out.print(Arrays.toString(mas)+"\n");
        int max = 0;
        int min = 10000;
        int endingZero = 0;
        int sum = 0;
        for (int x : mas) {
            if (max < x) max = x;
            else if (min > x) min = x;
            else if ((x % 10) == 0) {
                endingZero++;
                sum += x;
            }


        }
        System.out.println("Макс элемент: "+max);
        System.out.println("Мин элемент: "+min);
        System.out.println("Кол-во элементов заканчивающихся на 0: "+endingZero);
        System.out.println("Сумма элем заканч. на 0: "+sum);
    }
}
