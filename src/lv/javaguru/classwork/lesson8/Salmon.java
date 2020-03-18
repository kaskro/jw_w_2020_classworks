package lv.javaguru.classwork.lesson8;

public class Salmon extends Fish {

    @Override
    protected void swim() {
        System.out.println("Salmon is swimming");
    }

    @Override
    public void sleep() {
        System.out.println("Salmon is sleeping");
    }

    @Override
    public void poop() {
        System.out.println("Salmon is pooping");
    }
}
