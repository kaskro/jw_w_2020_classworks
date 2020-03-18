package lv.javaguru.classwork.lesson8.shapes;

public class Circle extends Shape implements Roundable {

    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double radius() {
        return radius;
    }

    @Override
    double area() {
        return Math.PI * radius() * radius();
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius();
    }
}
