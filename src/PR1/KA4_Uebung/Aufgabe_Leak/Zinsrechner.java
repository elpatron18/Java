package PR1.KA4_Uebung.Aufgabe_Leak;

import java.util.Scanner;

/*** Eine Klasse zum interaktiven Berechnen von Kapital nach verzinsung über mehrere Jahre
 *
 * @author Timo Antoniak
 * @version 1.0
 *
 * @see java.util.Scanner
 * */


public class Zinsrechner {

    public static void main(String[] args) {

        double dstartkapital = 0.0;
        double dverzinsung = 0.0;
        int ilaufzeit = 0;
        double entwert = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie das Startkapital an");
        dstartkapital = sc.nextDouble();

    }

    /*** Leifert Kapital zurück
     *
     * @return Geldmenge am Ende
     *
     * @param laufzeit Wie lange das Gelnd dort angelegt ist
     * @param startkapital Das unverzinste Kapital zu Beginn
     * @param verzinsung Die Zinsen
     * */


   public static double kapital(int laufzeit, double startkapital, double verzinsung) {

        if (laufzeit == 0) return startkapital;
        else return kapital(laufzeit-1, startkapital, verzinsung) * (1+verzinsung);

   }


    /*** Leifert Kapital zurück mit dem Standart-Zinssatz von 5%
     *
     * @return Geldmenge am Ende
     *
     * @param laufzeit Wie lange das Gelnd dort angelegt ist
     * @param startkapital Das unverzinste Kapital zu Beginn
     * */

    public static double kapital(int laufzeit, double startkapital) {

        if (laufzeit == 0) return startkapital;
        else return kapital(laufzeit-1, startkapital) * 1.05;

    }


}
