package Aggregation.Aufgabe1;

public class Greifer extends Werkzeug{

    public Greifer(String art, int verschleiss) {
        super(art, verschleiss);
    }

    @Override
    public void ausgeben() {
        System.out.println("Greifer{" +
                "verschleiss=" + verschleiss +
                '}');
    }
}
