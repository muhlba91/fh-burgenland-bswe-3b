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
    public void testDivideZeroReturnErrorCode() {
        assertEquals(-1, calc.divide(1, 0), "1/0 should be -1");
    }

    @Test
    public void testMultiplyNumberOneByOneReturnsOne() {
        assertEquals(1, calc.multiply(1, 1), "1*1 should be 1");
    }

    @Test
    public void testMultiplyNumbersOneByZeroReturnsZero() {
        assertEquals(0, calc.multiply(1, 0), "1*0 should be 0");
    }
}
