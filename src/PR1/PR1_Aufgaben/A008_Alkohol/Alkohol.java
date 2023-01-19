package PR1.PR1_Aufgaben.A008_Alkohol;

import java.text.DecimalFormat;

public enum Alkohol {

    WEIN(12), BIER(4.5), BANANENSAFT(1), WASSER(0);

    private final double alkoholgehaltInProzent;

    private Alkohol(double alkoholgehaltInProzent) {
        this.alkoholgehaltInProzent = alkoholgehaltInProzent;
    }

    public double alkoholgehalt() {
        return alkoholgehaltInProzent;
    }

    public String abbauZeit(double menge, double gewicht) {

        double mengeAlkoholKg = menge * alkoholgehaltInProzent / 100;

        // (0,11g) / (h * kg)
        double abbauZeit = 9090.9 * mengeAlkoholKg / gewicht;

        return "Die Abbauzeit beträgt " + (new DecimalFormat("0.0")).format(abbauZeit)
                + " Stunden bei " + menge + " Liter "
                + this + " und einem Gewicht von "
                + gewicht + " kg.";
    }

}
