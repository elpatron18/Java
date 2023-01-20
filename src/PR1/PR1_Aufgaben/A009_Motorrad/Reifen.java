package PR1.PR1_Aufgaben.A009_Motorrad;

public class Reifen {

    private double durchmesser;
    private double profiltiefe;
    private String jahreszeit;

    public Reifen(double durchmesser, double profiltiefe, String jahreszeit) {
        this.durchmesser = durchmesser;
        this.profiltiefe = profiltiefe;
        this.jahreszeit = jahreszeit;
    }

    public double getDurchmesser() {
        return durchmesser;
    }

    public double getProfiltiefe() {
        return profiltiefe;
    }

    public String getJahreszeit() {
        return jahreszeit;
    }

    public void getInfo() {
        System.out.println("Durchmesser: " + durchmesser + " Profiltiefe: " + profiltiefe + " Jahreszeit: " + jahreszeit);
    }
}
