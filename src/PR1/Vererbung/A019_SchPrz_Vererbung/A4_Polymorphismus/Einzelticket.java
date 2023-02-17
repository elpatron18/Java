package PR1.Vererbung.A019_SchPrz_Vererbung.A4_Polymorphismus;

public class Einzelticket extends Ticket {

    private int zone;
    private String verfallsDatum;
    public Einzelticket(int preis) {
        super(preis);
    }
    public String getVerfallsDatum() { return verfallsDatum; }
    @Override
    public boolean gueltigInZone(int zone) {
        return this.zone == zone;
    }

}
