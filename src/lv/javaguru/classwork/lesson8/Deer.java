package lv.javaguru.classwork.lesson8;

public class Deer implements Animal {

    @Override
    public void eat() {
        System.out.println("Deer is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Deer is sleeping");
    }

    @Override
    public void poop() {
        System.out.println("Deer is pooping");
    }
}
