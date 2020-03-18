package lv.javaguru.classwork.lesson8.shapes;

public abstract class Shape {

    abstract double area();

    abstract double perimeter();

    @Override
    public String toString() {
        return "\nMy perimeter is " + perimeter()
                + "\nMy area is " + area();
    }
}
