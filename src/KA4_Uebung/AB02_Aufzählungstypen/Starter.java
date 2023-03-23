package KA4_Uebung.AB02_Aufzählungstypen;

public class Starter {

    public static void main(String[] args) {

        Monat monat = Monat.JAN;

        System.out.println(monat.name() + " hat " + monat.tage + " Tage.");

        if (monat.jz == Jahreszeit.WINTER) {
            System.out.println("Der Monat " + monat.name() + " ist im Winter.");
        } else {
            System.out.println("Der Monat " + monat.name() + " ist nicht im Winter.");
        }

    }

}
