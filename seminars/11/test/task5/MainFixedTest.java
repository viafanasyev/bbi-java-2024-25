package task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainFixedTest {
    @Test
    public void testParseYear() {
        assertEquals(2025, MainFixed.parseYear("2025"));
        assertEquals(0, MainFixed.parseYear("0"));
        assertEquals(-1, MainFixed.parseYear("2026"));
        assertEquals(-1, MainFixed.parseYear("100000000000"));
        assertEquals(-1, MainFixed.parseYear("abacaba"));
        assertEquals(-1, MainFixed.parseYear(""));
    }

    @Test
    public void testGetAge() {
        assertEquals(0, MainFixed.getAge(2025));
        assertEquals(2025, MainFixed.getAge(0));
        assertEquals(25, MainFixed.getAge(2000));
    }

    @Test
    public void testGetSum() {
        assertEquals(2025, MainFixed.getSum(2025));
        assertEquals(4049, MainFixed.getSum(2024));
        assertEquals((1 + 2025) * 2025 / 2, MainFixed.getSum(1));
        //            ^ Сумма арифм. прогрессии 1, 2, ..., 2025
    }
}