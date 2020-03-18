package lv.javaguru.classwork.lesson8.shapes;

import java.util.Arrays;

public class GeometryDemo {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Square square = new Square(10);
        Triangle triangle = new Triangle(4, 5, 7);

        Shape[] myShapes = {circle, square, triangle};

        for (Shape shape : myShapes) {
            System.out.println(shape.toString());
        }

        // This does same as above
        Arrays.stream(myShapes).forEach(shape -> System.out.println(shape));

        // Same as above but shorter
        Arrays.stream(myShapes).forEach(System.out::println);
    }
}
