package PR1.PR1_Aufgaben.Vererbung.A016_Rechnung;

public class RabattierteRechnung extends Rechnung {
    private double rabatt;
    public RabattierteRechnung(double gesamtbetrag, double mehrwertssteuer, double rabatt) {
        super(gesamtbetrag, mehrwertssteuer);
        this.rabatt = rabatt;
    }
    @Override
    protected double bruttobetragRechner() {
        return super.bruttobetragRechner() * (1 + rabatt);
    }
}
