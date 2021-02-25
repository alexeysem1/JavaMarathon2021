package day3;

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = "Stop";
        while (true) {
            String city = scan.nextLine();
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    continue;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    continue;
                case "Лондон":
                case "Ливерпуль":
                case "Манчестер":
                    System.out.println("Англия");
                    continue;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    continue;
                default:
                    System.out.println("Неизвестная страна");
                    continue;
                case "Stop":
                    break;

            }
            break;
        }
    }

}

