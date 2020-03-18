package lv.javaguru.classwork.lesson5;

public class BasicCounter {

    private int value;

    public int getCounter() {
        return value;
    }

    public void setCounter(int value) {
        if (isPositive(value)) {
            this.value = value;
        } else {
            clear();
        }
    }

    private boolean isPositive(int value) {
        return value > 0;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void clear() {
        value = 0;
    }

}
