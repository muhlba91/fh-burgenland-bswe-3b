package io.muehlbachler.bswe3b;

import org.springframework.stereotype.Service;

/**
 * Service class for the calculator.
 */
@Service
public class CalculatorService {
   
    /**
     * Divides two numbers.
     * @param a
     * @param b
     * @return a divided by b
     */
    public int divide(final int a, final int b) {
        if(b <= 0){
            return 0;
        }
        return a/b;
    }
}
