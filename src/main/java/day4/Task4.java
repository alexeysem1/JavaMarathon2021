package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int sumOfThree;
        int[] mas = new int[100];
        for (int i = 0; i < mas.length; i++)
            mas[i] = rand.nextInt(10000);
        System.out.println(Arrays.toString(mas));

        sumOfThree = mas[0] + mas[1] + mas[2];
        for (int i = 2; i < mas.length; i++)
            if ((mas[i - 2] + mas[i - 1] + mas[i]) > sumOfThree)
                sumOfThree = mas[i - 2] + mas[i - 1] + mas[i];
        System.out.println("Наибольшая сумма трех :"+sumOfThree);
    }


}

