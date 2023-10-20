package io.muehlbachler.bswe3b;

import org.springframework.stereotype.Service;

/**
 * @author Julian Zankl
 */
@Service
public class CalculatorService {
    /**
     * Divides a by b.
     * @param a The dividend
     * @param b The divisor
     * @return The quotient
     */
    public int divide(final int a, final int b) {
        return b <= 0 ? 0 : a/b;
    }
}
