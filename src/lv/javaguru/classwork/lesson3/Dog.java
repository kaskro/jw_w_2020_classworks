package lv.javaguru.classwork.lesson3;

import java.awt.*;
import java.time.LocalDate;

public class Dog {

    private String name;
    private int yearOfBirth;
    private Color color;

    public Dog() {
    }

    public Dog(String name, Color color, int yearOfBirth) {
        this.name = name;
        this.color = color;
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void voice() {
        System.out.println("wuf wuf");
    }

    public void eat() {
        System.out.println("Om nom nom");
    }

    public void sleep() {
        System.out.println("Zzzz zzzz");
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearOfBirth;
    }
}

