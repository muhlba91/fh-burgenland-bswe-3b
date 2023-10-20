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
        assertEquals(2, calc.divide(5, 2), "5/2 should be 2");
    }

    @Test
    public void testDivideZeroReturnZero() {
        assertEquals(0, calc.divide(1, 0), "1/0 should be 0");
    }

    @Test
    public void testDivideMinusOneReturnZero() {
        assertEquals(0, calc.divide(1, -1), "1/-1 should be 0");
    }



}
