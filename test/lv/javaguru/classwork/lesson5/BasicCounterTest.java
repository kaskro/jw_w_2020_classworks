package lv.javaguru.classwork.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCounterTest {

    @Test
    void shouldReturnCounterValue() {
        BasicCounter basicCounter = new BasicCounter();
        assertEquals(0, basicCounter.getCounter() );
    }

    @Test
    void shouldBeZeroWhenSetNegativeValue() {
        BasicCounter basicCounter = new BasicCounter();
        int testValue = -5;
        basicCounter.increment();
        basicCounter.setCounter(testValue);
        assertEquals(0, basicCounter.getCounter());
    }

    @Test
    void shouldBePositiveCounterValue() {
        BasicCounter basicCounter = new BasicCounter();
        int testValue = 10;
        basicCounter.setCounter(testValue);
        assertEquals(testValue, basicCounter.getCounter());
    }

    @Test
    void shouldIncrementCounter() {
        BasicCounter basicCounter = new BasicCounter();
        int testValue = 1;
        basicCounter.increment();
        assertEquals(testValue, basicCounter.getCounter());
    }

    @Test
    void shouldDecrementCounter() {
        BasicCounter basicCounter = new BasicCounter();
        int testValue = -1;
        basicCounter.decrement();
        assertEquals(testValue, basicCounter.getCounter());
    }

    @Test
    void shouldClearValue() {
        BasicCounter basicCounter = new BasicCounter();
        int testValue = 0;
        basicCounter.setCounter(10);
        basicCounter.clear();
        assertEquals(testValue, basicCounter.getCounter());
    }
}