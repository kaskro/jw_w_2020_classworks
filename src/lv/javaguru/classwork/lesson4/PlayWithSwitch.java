package lv.javaguru.classwork.lesson4;

public class PlayWithSwitch {

    public static void main(String[] args) {
        printCode(200);
        printCode(400);
        printCode(450);
        printCode(500);
        printCode(505);
    }

    public static void printCode(int httpCode) {
        switch (httpCode) {
            case 200:
                System.out.println("Ok");
                break;
            case 400:
                System.out.println("Bad request");
                break;
            case 500:
            case 503:
            case 505:
                System.out.println("Server error");
                break;
            default:
                System.out.println("Unknown error");
        }
    }
}
