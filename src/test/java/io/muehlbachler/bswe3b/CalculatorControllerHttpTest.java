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
public class CalculatorControllerHttpTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testDividePositiveNumberNoRemainder() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/divide?a=1&b=1")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("1")));
    }

    @Test
    public void testDividePositiveNumberWithRemainder() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/divide?a=7&b=2")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("3")));
    }

    @Test
    public void testDivideNegativeNumberNoRemainder() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/divide?a=-1&b=-1")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("0")));
    }

    @Test
    public void testDivideNegativeNumberWithRemainder() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/divide?a=-7&b=-2")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("0")));
    }

    @Test
    public void testDivideZero() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/divide?a=3&b=0")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("0")));
    }
}
