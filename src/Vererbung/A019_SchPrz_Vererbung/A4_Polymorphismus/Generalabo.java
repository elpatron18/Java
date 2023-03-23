package Vererbung.A019_SchPrz_Vererbung.A4_Polymorphismus;

public class Generalabo extends Ticket {

    private String inhaber;
    private String verfallsDatum;

    public Generalabo(int preis, String inhaber, String verfallsDatum) {
        super(preis);
        this.inhaber = inhaber;
        this.verfallsDatum = verfallsDatum;
    }

    public void entwerten() {    }
    public String getVerfallsDatum() { return verfallsDatum; }
    @Override public boolean gueltigInZone(int zone) { return true; }

    public String gibInhaber() { return inhaber; }

}
