package KA5_Uebung.Aggregation;

public class Werkzeug {

    private String art;
    protected int verschleiss = 0;

    public Werkzeug(String art, int verschleiss) {
        this.art = art;

        if (verschleiss < 0) verschleiss = 0;
        else if (verschleiss > 100) verschleiss = 100;

        this.verschleiss = verschleiss;

    }
    public void ausgeben() {
        System.out.println(
                "Werkzeug{" +
                "art='" + art + '\'' +
                ", verschleiss=" + verschleiss +
                '}'
        );
    }
}
