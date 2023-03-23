package Vererbung.A018_Override;

public abstract class Bankkonto {

    protected double kontostand;

    public Bankkonto(double kontostand) {
        this.kontostand = kontostand;
    }
    public double getKontostand() {
        return this.kontostand;
    }

    public abstract void einzahlen(double betrag);
    public abstract void auszahlen(double betrag);
}
