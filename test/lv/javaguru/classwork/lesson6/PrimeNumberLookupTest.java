package lv.javaguru.classwork.lesson6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberLookupTest {

    private PrimeNumberLookup lookup;

    @BeforeEach
    void setUp() {
        lookup = new PrimeNumberLookup();
    }

    @Test
    void shouldBePrimeNumber() {

        boolean result = lookup.isPrimeNumber(13);
        assertEquals(true, result);
    }

    @Test
    void shouldNotBePrimeNumber() {

        boolean result = lookup.isPrimeNumber(6);
        assertEquals(false, result);
    }

    @Test
    void shouldPrintAllPrimeNumbersWithinInterval() {

        for (int i = 0; i < 100; i++) {
            if (lookup.isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    @Test
    void shouldSumPrimeNumbersUntilReached50() {
    // This doesn't work as intended. Needs to be 5501
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 500; i++) {
            if (i == 17 || i == 71) {
                continue;
            }
            if (lookup.isPrimeNumber(i)) {
                sum += i;
                count++;
            }
            if (count == 50) {
                break;
            }
        }
        System.out.println("summa = " + sum);
        System.out.println("skaits = " + count);
    }
}