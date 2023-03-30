package Aggregation.Aufgabe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Industrieroboter {

    final int maxAnzWerkzeuge = 10;

    List<Werkzeug> werkzeugKasten = new ArrayList<>(Collections.nCopies(maxAnzWerkzeuge + 1, null));

    public Industrieroboter() {    }

    public boolean werkzeugHinzufuegen(int platz, Werkzeug neu) {
        if (platz >= 0 && platz <= 10 && werkzeugKasten.get(platz) == null){
            werkzeugKasten.add(platz, neu);
            return true;
        }
        else return false;
    }

    public boolean werkzeugEntfernen(int platz) {
        if (platz >= 0 && platz <= 10 && werkzeugKasten.get(platz) != null){
            werkzeugKasten.remove(platz);
            return true;
        }
        else return false;
    }
}
