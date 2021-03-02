package day8;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2000, 150, 10000);
        airplane.fillUp(20000);
        airplane.fillUp(30000);
        airplane.setYear(2015);
        airplane.setLength(45);
        System.out.println(airplane);

    }
}
