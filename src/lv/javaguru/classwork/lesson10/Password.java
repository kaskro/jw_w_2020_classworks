package lv.javaguru.classwork.lesson10;

public class Password {

    private String value;

    public Password(String value) {
        if (!isValid(value)) {
            throw new IllegalArgumentException("Wrong input value");
        }
        this.value = value;
    }

    private boolean isValid(String value) {
        return value != null && !value.equals("");
    }

    public String getValue() {
        return value;
    }
}
