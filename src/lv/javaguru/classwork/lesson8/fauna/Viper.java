package lv.javaguru.classwork.lesson8.fauna;

public class Viper implements Animal {

    @Override
    public void eat() {
        System.out.println("Viper is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Viper is sleeping");
    }

    @Override
    public void poop() {
        System.out.println("Viper is pooping");
    }

    public void dropSkin() {
        System.out.println("Viper has dropped a skin");
    }

}
