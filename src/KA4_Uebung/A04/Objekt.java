package KA4_Uebung.A04;

public class Objekt {

    private Shapes form;
    private int a;
    private int b;

    public Objekt(Shapes form, int a, int b) {
        this.form = form;
        this.a = a;
        this.b = b;
    }
    public Objekt(Shapes form, int a) {
        this.form = form;
        this.a = a;
        this.b = a;
    }

    public double flaeche() {
        return switch (this.form) {
            case KREIS -> 2 * Math.PI * this.a;
            case DREIECK -> 0.5 * a * b;
            case RECHTECK -> a * b;
        };
    }
}
