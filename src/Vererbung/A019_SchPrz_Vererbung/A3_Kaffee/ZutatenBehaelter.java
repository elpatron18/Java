package Vererbung.A019_SchPrz_Vererbung.A3_Kaffee;

public class ZutatenBehaelter extends Behaelter {

    public String name;

    public ZutatenBehaelter(String name) {
        this.name = name;
    }

    public void entfernen(double menge) {
        this.fuellstand -= menge;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Max: " + this.maxInhalt + " Füllstand: " + this.fuellstand;
    }
}
