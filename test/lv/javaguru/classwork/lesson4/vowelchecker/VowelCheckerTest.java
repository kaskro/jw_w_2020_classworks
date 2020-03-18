package lv.javaguru.classwork.lesson4.vowelchecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelCheckerTest {

    @Test
    void shouldBeVowel() {
        VowelChecker vowelChecker = new VowelChecker();
        assertEquals(true, vowelChecker.isVowel('e'));
    }
}