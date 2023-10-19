package io.muehlbachler.bswe3b;

import org.springframework.stereotype.Service;

/**
 * Represents a calculator service, which provides only division so far.
 */
@Service
public class CalculatorService {
    /**
     * Divides two int type numbers and returns the ans.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The ans of the division.
     */
    public int divide(final int a, final int b) {
        // if only division by zero is the problem, then this should be b == 0
        return b < 0 ? 0 : a/b;
    }
}
