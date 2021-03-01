package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 2010, 40, 10000);
        Airplane plane2 = new Airplane("Airbus", 2014, 45, 12000);
        plane1.fillUp(25000);
        plane2.fillUp(25000);
        plane1.info();
        plane2.info();
        Airplane.compareAirplanes(plane1,plane2);

    }
}

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;

    }

    public void fillUp(int n) {
        this.fuel = n;
    }
   /* public int getLength(int length){
        return this.length;
    }*/


    public void info() {
        System.out.println("Изготовитель: " + producer);
        System.out.println("Год выпуска: " + year);
        System.out.println("Длина: " + length);
        System.out.println("Вес: " + weight);
        System.out.println("Количество топлива в баке: " + fuel);
    }

    public static void compareAirplanes(Airplane plane1, Airplane plane2) {
        if (plane1.length > plane2.length)
            System.out.println("Boeing длиннее");
        else if (plane2.length > plane1.length)
            System.out.println("Airbus длиннее");
    }

}