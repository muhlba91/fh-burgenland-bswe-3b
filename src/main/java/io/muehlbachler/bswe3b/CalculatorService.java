package io.muehlbachler.bswe3b;

import org.springframework.stereotype.Service;

// FIXME: add javadoc
@Service
public class CalculatorService {
    // FIXME: add javadoc

    /**
     *
     * @param a the number to divide
     * @param b the number to divide by
     * @return a/b
     */
    public int divide(final int a, final int b) {
        // FIXME: implement
        if (b <= 0) {
            return 0;
        } else {
            return a/b;
        }
    }
}
