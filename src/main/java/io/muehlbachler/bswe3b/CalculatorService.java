package io.muehlbachler.bswe3b;

import org.springframework.stereotype.Service;

/**
 * @author Julian Zankl
 */
@Service
public class CalculatorService {
    /**
     * Divides the given dividend with the divisor and returns the result (quotient).
     * @param a dividend
     * @param b divisor
     * @return quotient
     */
    public int divide(final int a, final int b) {
        return b < 0 ? 0 : a/b;
    }
}
