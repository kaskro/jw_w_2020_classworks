package lv.javaguru.classwork.lesson4;

public class PlayWithConditionals {
    public static void main(String[] args) {

        int x = 10;

        if (xWithinBounds(x)) {
            System.out.println("X is within bounds");
        }

        if (xIsInRange(x)) {
            System.out.println("X is correct");
        }

        if ((x > 5 && x < 10) || (x >= 10 && x <= 20)) {
            System.out.println("X is correct 2nd time");
        }

        if (x != 20) {
            System.out.println("X is not 20");
        }

        if (isNotInBounds(x)) {
            System.out.println("X is 10");
        }

        if (x == 10)
            System.out.println("X is 10");
        else if (x == 11)
            System.out.println("X is 11");
        else
            System.out.println("X is something else");

        String message = x == 10 ? "10" : "NOT ten";
        System.out.println("x is: " + message);

        System.out.println("X is: " + (x == 10 ? "10" : "NOT ten"));

    }

    private static boolean isNotInBounds(int x) {
        return (x < 5 && x > 15) || x == 10;
    }

    private static boolean xIsInRange(int x) {
        return x < 5 || x >= 10;
    }

    private static boolean xWithinBounds(int x) {
        return x > 5 && x < 15;
    }
}
