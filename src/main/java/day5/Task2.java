package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike(2020, "blue", "Yamaha");
        moto.getYear();
        moto.getColour();
        moto.getModel();
        moto.getInfo();


    }
}

class Motorbike {
    int year;
    String colour;
    String model;


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

    public void getInfo() {
        System.out.println(year + ", " + colour + ", " + model);
    }
}
