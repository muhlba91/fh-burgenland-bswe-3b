package io.muehlbachler.bswe3b;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.hamcrest.Matchers;

@WebMvcTest(CalculatorController.class)
class CalculatorControllerHttpMockTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private CalculatorService calculator;

    @Test
    void testDividePositiveNumberNoRemainder() throws Exception {
        when(calculator.divide(1, 1)).thenReturn(1);

        mvc.perform(MockMvcRequestBuilders.get("/divide?a=1&b=1")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("1")));
        verify(calculator, times(1)).divide(1, 1);
    }

/*
    @Test
    void testDivideZeroReturnErrorCode() throws Exception {
        when(calculator.divide(1, 0)).thenReturn(-1);

        mvc.perform(MockMvcRequestBuilders.get("/divide?a=1&b=0")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("-1")));
        verify(calculator, times(1)).divide(1, 0);
    }
*/
    @Test
    void testMultiplyNumberOneByOneReturnsOne() throws Exception {
        when(calculator.multiply(1, 1)).thenReturn(1);

        mvc.perform(MockMvcRequestBuilders.get("/multiply?a=1&b=1")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("1")));
        verify(calculator, times(1)).multiply(1, 1);
    }

    @Test
    void testMultiplyNumbersOneByZeroReturnsZero() throws Exception {
        when(calculator.multiply(1, 0)).thenReturn(-1);

        mvc.perform(MockMvcRequestBuilders.get("/multiply?a=1&b=0")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("0")));
        verify(calculator, times(1)).multiply(1, 0);
    }
}
