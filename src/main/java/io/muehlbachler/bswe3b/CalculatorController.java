package io.muehlbachler.bswe3b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalculatorController {
    @Autowired
    private CalculatorService calculator = new CalculatorService();

    @GetMapping("/divide")
    int divide(@RequestParam(value = "a") final int a, @RequestParam(value = "b") final int b) {
        return calculator.divide(a, b);
    }

    @GetMapping("/multiply")
    int multiply(@RequestParam(value = "a") final int a, @RequestParam(value = "b") final int b) {
        return calculator.multiply(a, b);
    }
}
