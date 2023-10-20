package io.muehlbachler.bswe3b;

import org.springframework.stereotype.Service;

// calculator - documentation n
@Service
public class CalculatorService {
   public int divide(final int a, final int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public int multiply(final int a, final int b) {
        return a * b;
    }
}
