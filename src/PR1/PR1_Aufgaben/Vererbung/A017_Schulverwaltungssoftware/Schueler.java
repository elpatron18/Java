package PR1.PR1_Aufgaben.Vererbung.A017_Schulverwaltungssoftware;

public class Schueler extends Mensch{

    final static int jahresbeitragfaktor = 5;
    protected int stufe;

    public double jaehrlBetrag() {
        return (double) this.alter / this.stufe * jahresbeitragfaktor;
    }
}
