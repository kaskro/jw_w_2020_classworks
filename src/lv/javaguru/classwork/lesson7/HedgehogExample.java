package lv.javaguru.classwork.lesson7;

public class HedgehogExample {

    public static void main(String[] args) {

        char[] hedgehog = new char[4];
        hedgehog[0] = 'E';
        hedgehog[1] = 'z';
        hedgehog[2] = 'i';
        hedgehog[3] = 's';

        for (int i = 0; i < hedgehog.length; i++) {
            System.out.print(hedgehog[i]);
        }

        for (char character : hedgehog){
            System.out.print(character);
        }

    }
}
