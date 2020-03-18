package lv.javaguru.classwork.lesson6;

public class PrimeNumberLookup {

    public boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
