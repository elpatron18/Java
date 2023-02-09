package PR1.PR1_Aufgaben.Sonstige.A010_Dokumentation;

/**
 * Artikel dienen zum Einlagern im Warehouse mit Preis und Artikelnummer
 * @author Timo Antoniak
 * @version 4.0
 */


public class Artikel {

    /**
     * Der aktuelle Merhwertsteuersatz.
     * Er liegt zur Zeit bei {@value} Prozent.
     * @since 1.0
     */

     final static int mehrwertsteuer = 21;

     private static String artikelname;

    /**
     * Liefert den Namen eines Artikels zurück.
     * @return Name des Artikels
     */

    public static String getArtikelname() {
        return artikelname;
    }

    /**
     * Setzen eines neuen Artikelnamens
     * @param artikelname Zeichenkette die den Namen des Artikels übergibt
     */

    public static void setArtikelname(String artikelname) {
        Artikel.artikelname = artikelname;
    }

}
