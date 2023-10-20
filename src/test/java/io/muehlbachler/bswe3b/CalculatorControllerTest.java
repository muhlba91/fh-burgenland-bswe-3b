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

    // FIXME: implement more tests
}
