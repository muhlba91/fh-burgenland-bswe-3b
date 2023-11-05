package io.muehlbachler.bswe3b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The controller defines the exposed calculator API.
 */
@RestController
public class CalculatorController {
    @Autowired
    private final CalculatorService calculator = new CalculatorService();

    @GetMapping("/divide")
    public int divide(@RequestParam("a") final int a, @RequestParam("b") final int b) {
        return calculator.divide(a, b);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam("a") final int a, @RequestParam("b") final int b) {
        return calculator.multiply(a, b);
    }
}
