package lv.javaguru.classwork.lesson6;

public class OddNumberTable {

    public static void main(String[] args) {

        printTableWithForLoop();
        System.out.println();

        printTableWithWhileLoop();
        System.out.println();

        printTableWithDoWhileLoop();
        System.out.println();

    }

    private static void printTableWithDoWhileLoop() {
        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i < 50);
    }

    private static void printTableWithWhileLoop() {
        int i = 0;
        while (i < 50) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    private static void printTableWithForLoop() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
