package Projekt;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Restaurant {

    static ArrayList <Gericht> speisekarte;
    public static void main(String[] args) throws SQLException {

        speisekarte = new ArrayList<>();

        Connection dbVerbindung = null;
        dbVerbindung = DBTabelleLesen.bauVerbindungAuf();
        if (dbVerbindung != null) {
            DBTabelleLesen.speicherTabelle(dbVerbindung, speisekarte);
            dbVerbindung.close();
        }

        speisekarte.forEach((g) -> System.out.println(g.toString()));

        BestellfensterV2 bf = new BestellfensterV2("Antonio's Burger Palace");

        speisekarte.forEach(bf::gerichtHinzufuegen);

    }
}
