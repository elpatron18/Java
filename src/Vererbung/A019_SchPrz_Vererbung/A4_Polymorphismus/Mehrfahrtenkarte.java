package Vererbung.A019_SchPrz_Vererbung.A4_Polymorphismus;

public class Mehrfahrtenkarte extends Ticket {

    private int fahrten;
    private int zone;

    public Mehrfahrtenkarte(int preis, int fahrten, int zone) {
        super(preis);
        this.fahrten = fahrten;
        this.zone = zone;
    }

    @Override
    public void entwerten() {
        if (fahrten == 0) return;
        fahrten--;
    }

    @Override
    public boolean istEntwertet() { return fahrten == 0; }
    @Override public boolean gueltigInZone(int zone) { return this.zone == zone; }
}
