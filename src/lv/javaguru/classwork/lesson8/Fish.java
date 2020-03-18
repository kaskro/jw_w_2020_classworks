package lv.javaguru.classwork.lesson8;

public abstract class Fish implements Animal {

    protected abstract void swim();

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    public void makeBubbles() {
        System.out.println("Fish is bubbling");
    }
}
