package KA5_Uebung.Aggregation;

public class Industrieroboter {

    final static int maxAnzWerkzeuge = 10;

    public static Werkzeug [] werkzeugKasten = new Werkzeug[maxAnzWerkzeuge];

    public Industrieroboter() {
    }

    public boolean werkzeugHinzufuegen(int platz, Werkzeug neu){
        if (platz >= 0 && platz < werkzeugKasten.length) {
            if (werkzeugKasten[platz] == null) {
                werkzeugKasten[platz] = neu;
                return true;
            }
        }
        return false;
    }

    public boolean werkzeugEntfernen(int platz) {
        if (platz >= 0 && platz < werkzeugKasten.length)
            if (werkzeugKasten[platz] != null) {
                werkzeugKasten[platz] = null;
                return true;
            }
        return false;
    }
}
