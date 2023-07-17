package Projekt;

import java.sql.Connection;
import java.sql.Date;

public class Bestellung {

    int id;
    Date datum;
    double summe;
    static int id_counter;

    public Bestellung(java.util.Date datum, double summe, Connection verbindung) {
        updateID(verbindung);
        this.id = id_counter + 1;
        this.datum = new java.sql.Date(datum.getTime());
        this.summe = summe;

        DBTabelleLesen.bestellungVerarbeiten(verbindung, this);
        Restaurant.bestellungen.add(this);
    }
    public static void updateID(Connection c){
        try {
            id_counter = DBTabelleLesen.wieVieleBestellungen(c);
        }catch (Exception e) {
            System.out.println("Keine Verbindung möglich");
        }
    }
}
