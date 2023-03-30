package Aggregation.Aufgabe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Industrieroboter {

    final int maxAnzWerkzeuge = 10;

    List<Werkzeug> werkzeugKasten = new ArrayList<>();

    public Industrieroboter() {
        for (int i = 0; i <= maxAnzWerkzeuge; i++) werkzeugKasten.add(null);
    }

    public boolean werkzeugHinzufuegen(int platz, Werkzeug neu) {
        if (platz >= 0 && platz <= 10 && werkzeugKasten.get(platz) == null){
            werkzeugKasten.add(platz, neu);
            return true;
        }
        else return false;
    }

    public boolean werkzeugEntfernen(int platz) {
        if (platz >= 0 && platz <= 10 && werkzeugKasten.get(platz) != null){
            werkzeugKasten.set(platz, null);
            return true;
        }
        else return false;
    }
}
