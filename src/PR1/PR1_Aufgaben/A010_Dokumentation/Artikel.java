package PR1.PR1_Aufgaben.A010_Dokumentation;

/**
 * Artikel dienen zum Einlagern im Warehouse mit Preis und Artikelnummer
 * @author Timo Antoniak
 * @version 4.0
 */


public class Artikel {

     final static int mehrwertsteuer = 21;

     /**
      * Der aktuelle Merhwertsteuersatz.
      * Er liegt zur Zeit bei {@value #mehrwertsteuer} Prozent.
      *
      * @since 1.0
      */

     private static String artikelname;

    public static String getArtikelname() {
        return artikelname;
    }

    /**
     * Liefert den Namen eines Artikels zurück.
     * @return Name des Artikels
     */

    public static void setArtikelname(String artikelname) {
        Artikel.artikelname = artikelname;
    }

    /**
     * Setzen eines neuen Artikelnamens
     * @param artikelname Zeichenkette die den Namen des Artikels übergibt
     */


}
