package lv.javaguru.classwork.lesson4;

public class PlayWithIfs {

    public static void main(String[] args) {

        int x = 10;
        if (x > 5) {
            System.out.println("X is greater than 5");
        }

        x = 4;
        if (x > 5) {
            System.out.println("X is greater than 5");
        } else {
            System.out.println("X is smaller than 5");
        }

        if (x > 5)
            System.out.println("X is greater than 5");
        else
            System.out.println("X is smaller than 5");

        x = 5;
        if (x > 5) {
            System.out.println("X is greater than 5");
        } else if (x < 5) {
            System.out.println("X is smaller than 5");
        } else {
            System.out.println("X is 5");
        }

    }
}
