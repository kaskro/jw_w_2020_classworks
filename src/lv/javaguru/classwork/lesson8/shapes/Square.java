package lv.javaguru.classwork.lesson8.shapes;

public class Square extends Shape implements Edgable {

    private static final int SQUARE_EDGE_COUNT = 4;
    private final double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return side * SQUARE_EDGE_COUNT;
    }

    @Override
    public int edgeCount() {
        return SQUARE_EDGE_COUNT;
    }
}
