package PR1.PR1_Aufgaben.A013_Vererbung;

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
