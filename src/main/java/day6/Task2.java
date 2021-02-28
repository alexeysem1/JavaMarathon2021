package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing", 2010, 40, 10000);
        plane.fillUp(20000);
        plane.fillUp(30000);
        plane.setYear(2015);
        plane.setLength(45);
        plane.info();

    }
}

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;

    }

    public void fillUp(int n) {
        this.fuel = n;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer);
        System.out.println("Год выпуска: " + year);
        System.out.println("Длина: " + length);
        System.out.println("Вес: " + weight);
        System.out.println("Количество топлива в баке: " + fuel);
    }

}
