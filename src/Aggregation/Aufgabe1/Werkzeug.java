package Aggregation.Aufgabe1;

public class Werkzeug {
    private String art;
    protected int verschleiss;

    public Werkzeug(String art, int verschleiss) {
        this.art = art;

        if (verschleiss < 0) verschleiss = 0;
        else if (verschleiss > 100) verschleiss = 100;

        this.verschleiss = verschleiss;
    }

    public void ausgeben() {
        System.out.println("Ein " + art + "mit Verschleiß von " + verschleiss);
    }

}
