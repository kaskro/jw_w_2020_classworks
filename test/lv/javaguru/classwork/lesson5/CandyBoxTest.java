package lv.javaguru.classwork.lesson5;

import lv.javaguru.classwork.lesson3.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyBoxTest {

    @Test
    void shouldBeEquals() {

        CandyBox firstBox = new CandyBox("Prozit", 8);
        CandyBox secondBox = new CandyBox("Prozit", 8);

        assertTrue(firstBox.equals(secondBox));
    }

    @Test
    void shouldBeEqualsWhenTheSameObjectRefference() {

        CandyBox box = new CandyBox("Prozit", 8);
        CandyBox sameBox = box;

        assertTrue(box.equals(sameBox));
    }

    @Test
    void shouldNotBeEqualdWhenThatIsNull() {

        CandyBox box = new CandyBox("Prozit", 8);

        assertFalse(box.equals(null));
    }

    @Test
    void shouldNotBeEqualWhenOtherClassProvided() {

        CandyBox box = new CandyBox("Prozit", 8);
        Dog dog = new Dog();

        assertFalse(box.equals(dog));
    }

    @Test
    void shouldPrintOut() {

        CandyBox box = new CandyBox("Prozit", 8);

        assertEquals("CandyBox{name='Prozit', amount='8'}", box.toString());

        System.out.println(box);
    }
}