package PR1.Vererbung.A018_Override;

public class Bankkonto {

    protected double kontostand;

    public Bankkonto(double kontostand) {
        this.kontostand = kontostand;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void einzahlen(double betrag) {
        this.kontostand += betrag;
    }

    public void auszahlen(double betrag) {
        this.kontostand -= betrag;
    }
}
