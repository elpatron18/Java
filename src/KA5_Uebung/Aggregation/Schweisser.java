package KA5_Uebung.Aggregation;

public class Schweisser extends Werkzeug{

    public Schweisser(String art, int verschleiss) {
        super(art, verschleiss);
    }

    @Override
    public void ausgeben() {
        System.out.println(
            "Schweisser{" +
            "verschleiss=" + verschleiss +
            '}'
        );
    }
}

