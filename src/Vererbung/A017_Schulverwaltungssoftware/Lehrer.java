package Vererbung.A017_Schulverwaltungssoftware;

public class Lehrer extends Mensch{
    private String fach;

    public Lehrer(int alter, String name, String fach) {
        super(alter, name);
        this.fach = fach;
    }

    public Lehrer(String fach) {
        this.fach = fach;
    }
}
