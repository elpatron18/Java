package PR1.PR1_Aufgaben.A013_Vererbung.Ordner1;

public class Mitarbeiter extends Azubi {

    private String name;
    private String vorname;
    private double gehalt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }
}
