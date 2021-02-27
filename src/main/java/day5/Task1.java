package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2020);
        car.setColour("red");
        car.setModel("Tesla");
        car.getYear();
        car.getColour();
        car.getModel();
        car.getInfo();
    }
}

class Car {
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

    public void getInfo() {
        System.out.println(year + ", " + colour + ", " + model);
    }
}

