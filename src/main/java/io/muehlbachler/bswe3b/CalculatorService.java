package io.muehlbachler.bswe3b;

import org.springframework.stereotype.Service;


/**
 * Diese Klasse bietet Dienste für einfache Berechnungen.
 */
@Service
public class CalculatorService {

    /**
     * Diese Methode teilt zwei Ganzzahlen.
     *
     * @param a Der Dividend.
     * @param b Der Divisor.
     * @return Das Ergebnis der Division.
     */
    public int divide(final int a, final int b) {
        // Prüfen, ob der Divisor nicht null ist, um eine Division durch null zu verhindern.
        if (b == 0) {
            throw new IllegalArgumentException("Der Divisor darf nicht null sein.");
        }

        final int ergebnis = a / b;

        System.out.println(ergebnis);

        return ergebnis;
    }
}

