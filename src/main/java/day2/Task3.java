package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int b = scan.nextInt();
        if (x >= b) {
            System.out.println("Некорректный ввод");
        }
        int a = x + 1;
        while (a < b) {
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
