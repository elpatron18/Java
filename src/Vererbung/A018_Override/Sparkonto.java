package Vererbung.A018_Override;

public class Sparkonto extends Bankkonto{

    private double zinssatz;

    public Sparkonto(double anfangsBestand, double zinssatz) {
        super(anfangsBestand);
        this.zinssatz = zinssatz;
    }
    public void zinsenAnrechnen(){
        this.einzahlen(kontostand * (zinssatz / 100));
    }

    @Override
    public void auszahlen(double betrag) {
        this.kontostand -= betrag;
    }
    @Override
    public void einzahlen(double betrag) {
        this.kontostand += betrag;
    }
}
