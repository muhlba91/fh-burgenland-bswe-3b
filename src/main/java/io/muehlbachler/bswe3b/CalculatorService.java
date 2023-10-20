package io.muehlbachler.bswe3b;

import org.springframework.stereotype.Service;

/**
 * Provides basic calculation types
 */
@Service
public class CalculatorService {
    /**
     * Divides a with b
     *
     * @param a the dividend, that is being divided
     * @param b the divisor, that is divided by
     * @return the result of the division or 0 if b < 0
     */
    public int divide(final int a, final int b) {
        if(b <= 0){
            return 0;
        } else {
            return a/b;
        }
    }
}
