package io.muehlbachler.bswe3b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private CalculatorService calc = new CalculatorService();

    @Test
    public void testDividePositiveNumberNoRemainder() {
        assertEquals(1, calc.divide(1, 1), "1/1 should be 1");
    }

    @Test
    public void testDividePositiveNumberWithRemainder() {
        assertEquals(3, calc.divide(7, 2), "7/2 should be 3");
    }

    @Test
    public void testDivideNegativeNumberNoRemainder() {
        assertEquals(0, calc.divide(-1, -1), "-1/-1 should be 0");
    }

    @Test
    public void testDivideNegativeNumberWithRemainder() {
        assertEquals(0, calc.divide(-7, -2), "-7/-2 should be 0");
    }
}
