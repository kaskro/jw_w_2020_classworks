package lv.javaguru.classwork.lesson2;

public class FloatingPointCalculations {
    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 4;

        int resultAsInt = firstNumber / secondNumber;
        System.out.println(resultAsInt);

        double resultAsDouble = firstNumber / secondNumber;
        System.out.println(resultAsDouble);

        double resultAsDoubleCasted = firstNumber / (double) secondNumber;
        System.out.println(resultAsDoubleCasted);

    }
}
