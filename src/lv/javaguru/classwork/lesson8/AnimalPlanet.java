package lv.javaguru.classwork.lesson8;

public class AnimalPlanet {

    public static void main(String[] args) {

        Animal mammal = new Deer();
        Animal snake = new Viper();

        animalLifeCycle(mammal);

        animalLifeCycle(snake);

        fishesLifeCycle(new Salmon());
    }

    private static void fishesLifeCycle(Salmon salmon) {
        salmon.swim();
        salmon.makeBubbles();
        animalLifeCycle(salmon);
    }

    private static void animalLifeCycle(Animal animal) {
        animal.eat();
        animal.sleep();
        animal.poop();
    }
}
