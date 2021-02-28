package day6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike(2020, "blue", "Yamaha");
        moto.info();
        moto.yearDifference();
    }
}

class Input {
    Scanner scan = new Scanner(System.in);
    int inputYear = scan.nextInt();
}

class Car extends Input {
    private int year;
    private String colour;
    private String model;

    public void setYear(int year) {
        this.year = year;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public void getInfo() {
        System.out.println(year + ", " + colour + ", " + model);
    }

    public void yearDifference() {
        System.out.println("Возраст ТС: " + (inputYear - year));
    }

}

class Motorbike extends Input {

    private int year;
    private String colour;
    private String model;


    public Motorbike(int year, String colour, String model) {
        this.year = year;
        this.colour = colour;
        this.model = model;

    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public void getInfo() {
        System.out.println(year + ", " + colour + ", " + model);
    }

    public void yearDifference() {
        System.out.println("Возраст ТС: " + (inputYear - year));
    }

}

