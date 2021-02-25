package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            double dividend = scan.nextDouble();
            double divisor = scan.nextDouble();
            double quotient = dividend / divisor;
            if (divisor == 0)
                break;
            System.out.println(quotient);
        }


    }
}
