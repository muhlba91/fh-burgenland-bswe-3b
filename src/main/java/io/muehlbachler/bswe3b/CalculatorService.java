package io.muehlbachler.bswe3b;

import org.springframework.stereotype.Service;

/**
 * Calculator Service class.
 */
@Service
public class CalculatorService {
    /**
     * Divides the given number a by b.
     * @param a The dividend.
     * @param b The divisor.
     * @return Returns the result of the division.
     */
    public int divide(final int a, final int b) {

        return (b > 0) ? a / b : -1;
    }

    /**
     * Multiplies the given number a by b.
     * @param a The multiplier.
     * @param b The multiplicand.
     * @return Returns the result of the division.
     */
    public int multiply(final int a, final int b) {

        return a * b;
    }
}
