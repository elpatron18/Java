package Projekt;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Restaurant {

    static ArrayList <Gericht> speisekarte = new ArrayList<>();
    static ArrayList <Rabattcode> codes = new ArrayList<>();
    static  ArrayList <Bestellung> bestellungen = new ArrayList<>();

    static Connection dbVerbindung;

    public static void main(String[] args) {

        dbVerbindung = DBTabelleLesen.bauVerbindungAuf();
        if (dbVerbindung != null) {
            DBTabelleLesen.speicherTabelle(dbVerbindung, speisekarte, codes);
        }

        Bestellfenster bf = new Bestellfenster("Antonio's Burger Palace");

        speisekarte.forEach(bf::gerichtHinzufuegen);
    }
}
