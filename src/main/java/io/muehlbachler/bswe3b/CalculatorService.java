package io.muehlbachler.bswe3b;

import org.springframework.stereotype.Service;

/**
 * Service to run a couple of divisions.
 */
@Service
public class CalculatorService {
    /**
     * Divides a by b.
     * 
     * @param a the dividend
     * @param b the divisor
     * @return the result of the division of a by b, 0 if b <= 0
     */
    public int divide(final int a, final int b) {
        if (b <= 0) {
            return 0;
        }

        return a / b;
    }

    /**
     * Multiplies a by b.
     * 
     * @param a the multiplicand
     * @param b the multiplier
     * @return the result of the multiplication of a times b
     */
    public int multiply(final int a, final int b) {
        return a * b;
    }
}
