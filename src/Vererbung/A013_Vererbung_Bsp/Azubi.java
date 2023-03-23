package Vererbung.A013_Vererbung_Bsp;

public class Azubi extends Mitarbeiter {

    private String beruf;
    private double ausbildungsjahr;

    public Azubi(String name, String vorname, double gehalt, String beruf, double ausbildungsjahr) {
        super(name, vorname, gehalt);
        this.beruf = beruf;
        this.ausbildungsjahr = ausbildungsjahr;
    }

    public Azubi(String beruf, double ausbildungsjahr) {
        super();
        this.beruf = beruf;
        this.ausbildungsjahr = ausbildungsjahr;
    }
}
