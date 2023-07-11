package Projekt;

public class Rabattcode {

    String name;
    double faktor;

    public Rabattcode(String name, double prozent) {
        this.name = name;
        this.faktor = prozent / 100;
    }
}
