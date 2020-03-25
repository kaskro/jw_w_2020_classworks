package lv.javaguru.classwork.lesson10;

public class PlayWithUncheckedException {

    public static void main(String[] args) {

        PlayWithUncheckedException playground = new PlayWithUncheckedException();
        try {
            System.out.println(playground.getText());
        } catch (RuntimeException ex) {
            System.out.println("Some error");
        }
    }

    private String getText() {
        throw new IllegalStateException("Something went wrong");
    }
}
