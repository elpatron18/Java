package Aggregation.Aufgabe1;

public class Bohrer extends Werkzeug {
    int groesse;

    public Bohrer(int verschleiss, int groesse) {
        super("Bohrer", verschleiss);
        this.groesse = groesse;
    }

    @Override
    public void ausgeben() {
        System.out.println("Bohrer: " + groesse + " " + verschleiss );
    }
}

