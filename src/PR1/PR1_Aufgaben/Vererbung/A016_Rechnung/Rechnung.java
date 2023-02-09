package PR1.PR1_Aufgaben.Vererbung.A016_Rechnung;

public class Rechnung {
    protected double gesamtbetrag;
    protected double mehrwertssteuer;

    public Rechnung(double gesamtbetrag, double mehrwertssteuer) {
        this.gesamtbetrag = gesamtbetrag;
        this.mehrwertssteuer = mehrwertssteuer;
    }
     protected double bruttobetragRechner() {
        return  this.gesamtbetrag + this.gesamtbetrag * this.mehrwertssteuer;
     }
}
