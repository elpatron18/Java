package Vererbung.A019_SchPrz_Vererbung.A4_Polymorphismus;

public abstract class Ticket {

    private int preis;
    private boolean entwertet;
    public Ticket (int preis) {
        this.preis = preis;
        entwertet = false;
    }

    public int getPreis() { return preis; };
    public void entwerten() { entwertet = true; };
    public boolean istEntwertet() { return entwertet; }
    public abstract boolean gueltigInZone( int zone );


}
