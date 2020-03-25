package lv.javaguru.classwork.lesson10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class PasswordTest {

    private Password password;

    @Test
    void shouldCreatePassword() {
        final String myPassword = "qwerty123";
        Password password = new Password(myPassword);
        assertEquals(myPassword, password.getValue());
    }

    @Test
    void shouldFailWhenValueIsNull() {
        try {
            new Password(null);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Wrong input value", ex.getMessage());
        }
    }

    @Test
    void shouldFailWhenValueIsBlank() {
        try {
            new Password("");
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Wrong input value", ex.getMessage());
        }
    }

}