package PR1.Vererbung.A018_Override;

public class Sparkonto extends Bankkonto{

    private double zinssatz;

    public Sparkonto(double anfangsBestand, double zinssatz) {
        super(anfangsBestand);
        this.zinssatz = zinssatz;
    }
    public void zinsenAnrechnen(){
        this.einzahlen(kontostand * (zinssatz / 100));
    }

}
