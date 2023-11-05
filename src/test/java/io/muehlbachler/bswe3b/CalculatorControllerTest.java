package io.muehlbachler.bswe3b;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
class CalculatorControllerTest {
    @Autowired
    private CalculatorController controller;

    @MockBean
    private CalculatorService calculator;

    @Test
    void testDividePositiveNumberNoRemainder() {
        when(calculator.divide(1, 1)).thenReturn(1);

        assertEquals(1, controller.divide(1, 1), "1/1 should be 1");
        verify(calculator, times(1)).divide(1, 1);
    }

    @Test
    void testDividePositiveNumberWithRemainder() {
        when(calculator.divide(1, 2)).thenReturn(0);

        assertEquals(0, controller.divide(1, 2), "1/2 should be 0");
        verify(calculator, times(1)).divide(1, 2);
    }

    @Test
    void testMultiply() {
        when(calculator.multiply(1, 2)).thenReturn(2);

        assertEquals(2, controller.multiply(1, 2), "1/2 should be 2");
        verify(calculator, times(1)).multiply(1, 2);
    }
}
