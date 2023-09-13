package io.muehlbachler.bswe3b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceTest {
    private CalculatorService calc = new CalculatorService();

    @Test
    void testDividePositiveNumberNoRemainder() {
        assertEquals(1, calc.divide(1, 1), "1/1 should be 1");
    }

    @Test
    void testDividePositiveNumberWithRemainder() {
        assertEquals(0, calc.divide(1, 2), "1/2 should be 0");
    }

    @Test
    void testDivideByZero() {
        assertEquals(0, calc.divide(1, 0), "1/0 should be 0");
    }

    @Test
    void testDivideByNegativeNumber() {
        assertEquals(0, calc.divide(1, -2), "1/-2 should be 0");
    }

    @Test
    void testMultiplyPositiveNumbers() {
        assertEquals(6, calc.multiply(2, 3), "2*3 should be 6");
    }

    @Test
    void testMultiplyZero() {
        assertEquals(0, calc.multiply(2, 0), "2*0 should be 0");
    }

    @Test
    void testMultiplyNegative() {
        assertEquals(-6, calc.multiply(-2, 3), "(-2)*3 should be -6");
    }
}
