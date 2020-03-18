package lv.javaguru.classwork.lesson8.shapes;

public class Triangle extends Shape implements Edgable {

    private static final int TRIANGLE_EDGE_COUNT = 3;
    private final double sideA, sideB, sideC, halfPerimeter;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        halfPerimeter = perimeter() / 2;
    }

    @Override
    double area() {
        return Math.sqrt(halfPerimeter
                * (halfPerimeter - sideA)
                * (halfPerimeter - sideB)
                * (halfPerimeter - sideC));
    }

    @Override
    double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public int edgeCount() {
        return TRIANGLE_EDGE_COUNT;
    }
}
