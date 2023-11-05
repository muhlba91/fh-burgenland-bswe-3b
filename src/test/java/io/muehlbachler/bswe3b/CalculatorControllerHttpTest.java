package io.muehlbachler.bswe3b;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import org.hamcrest.Matchers;

@SpringBootTest
@AutoConfigureMockMvc
class CalculatorControllerHttpTest {
    @Autowired
    private MockMvc mvc;

    @Test
    void testDividePositiveNumberNoRemainder() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/divide?a=1&b=1")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("1")));
    }

    @Test
    void testDividePositiveNumberWithRemainder() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/divide?a=1&b=2")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("0")));
    }

    @Test
    void testDivideByZero() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/divide?a=1&b=0")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("0")));
    }

    @Test
    void testMultiply() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/multiply?a=1&b=2")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("2")));
    }
}
