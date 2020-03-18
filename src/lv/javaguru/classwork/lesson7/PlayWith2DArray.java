package lv.javaguru.classwork.lesson7;

public class PlayWith2DArray {

    public static void main(String[] args) {

        int[][] numberArray = {
                {1, 5, 4},
                {3, 6, 9, 0, 1},
                {2, 8, 3, 5}
        };

        printClassicWay(numberArray);
        System.out.println();
        printAdvancedWay(numberArray);
    }

    private static void printAdvancedWay(int[][] numberArray) {
        for (int[] innerArray : numberArray) {
            for (int number : innerArray) {
                System.out.print(number + ", ");
            }
            System.out.println();
        }
    }

    private static void printClassicWay(int[][] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                System.out.print(numberArray[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
