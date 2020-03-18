package lv.javaguru.classwork.lesson2;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter base of a triangle: ");
        double base = scanner.nextDouble();

        System.out.println("Please enter height of a triangle: ");
        double height = scanner.nextDouble();

        double area = (base * height) / 2;
        System.out.println("The area of triangle is: " + area);
    }
}
