package lv.javaguru.classwork.lesson3;

import java.awt.*;

public class DogTest {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        doDogStuff(myDog);
        myDog.setName("Doggo");
        myDog.setYearOfBirth(2000);
        myDog.setColor(Color.BLACK);

        String myDogsName = myDog.getName();
        Color myDogsColor = myDog.getColor();
        int myDogsAge = myDog.getAge();

        System.out.println("My dog name is " + myDogsName);
        System.out.println("He was born in " + myDog.getYearOfBirth());
        System.out.println("He is " + myDogsAge + " years old");
        System.out.println("His fur color is " + myDogsColor + " color");
    }

    private static void doDogStuff(Dog myDog) {
        myDog.eat();
        myDog.sleep();
    }
}
