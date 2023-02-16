package PR1.Vererbung.A013_Vererbung_Bsp;

public class Fuehrungskraft extends Mitarbeiter {

    public String position;

    public Fuehrungskraft() {
        super();
    }
    public Fuehrungskraft(String name, String vorname, double gehalt) {
        super(name, vorname, gehalt);
        position = "nice";
    }
}
