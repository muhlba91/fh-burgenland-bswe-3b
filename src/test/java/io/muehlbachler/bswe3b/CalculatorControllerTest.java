package io.muehlbachler.bswe3b;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CalculatorControllerTest {
    @Autowired
    private CalculatorController controller;

    @MockBean
    private CalculatorService calculator;

    @Test
    public void testDividePositiveNumberNoRemainder() {
        when(calculator.divide(1, 1)).thenReturn(1);

        assertEquals(1, controller.divide(1, 1));
        verify(calculator, times(1)).divide(1, 1);
    }
    @Test
    public void testDividePositiveNumberWithRemainder() {
        when(calculator.divide(5, 2)).thenReturn(2);

        assertEquals(2, controller.divide(5, 2));
        verify(calculator, times(1)).divide(5, 2);
    }
    @Test
    public void testDivideZeroReturnZero() {
        when(calculator.divide(1, 0)).thenReturn(0);

        assertEquals(0, controller.divide(1, 0));
        verify(calculator, times(1)).divide(1, 0);
    }
    @Test
    public void testDivideMinusOneReturnZero() {
        when(calculator.divide(1, -1)).thenReturn(0);

        assertEquals(0, controller.divide(1, -1));
        verify(calculator, times(1)).divide(1, -1);
    }
}
