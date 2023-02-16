package PR1.Vererbung.A018_Override;

public class GiroKonto extends Bankkonto{
    private double gebuehr;
    public GiroKonto(double kontostand, double gebuehr) {
        super(kontostand);
        this.gebuehr = gebuehr;
    }
    @Override
    public void einzahlen(double x) {
        this.kontostand += x - this.gebuehr;
    }
    public void auszahlen(double x) {
        this.kontostand -= x - this.gebuehr;
    }
}
