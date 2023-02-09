package PR1.PR1_Aufgaben.Vererbung.A017_Schulverwaltungssoftware;

public class Klassensprecher extends Schueler{
    private double jahresbeitrag;

    public double getJahresbeitrag() {
        return jahresbeitrag;
    }

    public void setJahresbeitrag(double jahresbeitrag) {
        this.jahresbeitrag = jahresbeitrag;
    }

    @Override
    public double jaehrlBetrag() {
        return (double) this.alter/this.stufe * this.jahresbeitrag;
    }
}
