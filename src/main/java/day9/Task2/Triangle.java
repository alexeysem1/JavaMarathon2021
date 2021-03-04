package day9.Task2;

public class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double perimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    @Override
    public double area() {
        return Math.sqrt((perimeter() / 2) * (perimeter() / 2 - getSide1()) * (perimeter() / 2 - getSide2()) * (perimeter() / 2 - getSide3()));
    }


}
