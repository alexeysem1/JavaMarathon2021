package day4;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n = scan.nextInt();
        int moreThanEight = 0;
        int equalOne = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = rand.nextInt(11);
            if (mas[i] % 2 == 0)
                even++;
            else if (mas[i] % 2 != 0)
                odd++;
            if (mas[i] > 8)
                moreThanEight++;
            else if (mas[i] == 1)
                equalOne++;
            sum += mas[i];
        }


        for (int i = 0; i < n; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println("\nДлина массива: " + n + "\nКол-во чисел больше 8: " + moreThanEight + "\nКол-во чисел равных 1: " + equalOne + "\nКол-во четных: " + even + "\nКол-во нечетных: " + odd + "\nСумма элементов массива: " + sum);


    }
}
