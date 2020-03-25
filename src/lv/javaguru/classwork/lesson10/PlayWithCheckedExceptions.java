package lv.javaguru.classwork.lesson10;

import java.io.IOException;

public class PlayWithCheckedExceptions {

    public static void main(String[] args) {

        PlayWithCheckedExceptions playground = new PlayWithCheckedExceptions();

        try {
            String text = playground.getText(5);
            System.out.println("Text: " + text);
            playground.getText(2);
            System.out.println("Second time text: " + text);
        } catch (Exception e) {
            System.out.println("Failed to get text: " + e.getMessage());
        } finally {
            System.out.println("Some stuff that must be done");
        }


    }

    private String getText(int number) throws IOException {
        switch (number) {
            case 1:
                throw new IOException("Bad luck");
            case 2:
                throw new IOException("Still bad luck");
            default:
                return "You got lucky";
        }
    }
}
