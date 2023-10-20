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
        assertEquals(2, calc.divide(5, 2), "5/2 should be 2 with remainder 1");
    }

    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals(6, calc.multiply(2, 3), "2 * 3 should be 6");
    }
}
