package KA4_Uebung.A04;


/*Schreibe eine Java-Klasse, die einen Enum für die verschiedenen Formen eines Shapes
(z. B. Kreis, Rechteck, Dreieck) definiert. Implementiere eine Methode, um die Fläche des Shapes zu berechnen.  */
public enum Shapes {

    KREIS, RECHTECK, DREIECK;

    Shapes() {
    }

    public double flaeche(Shapes form, double messwert) {

        return switch(this) {
            case KREIS -> Math.PI * Math.pow(messwert, 2);
            case DREIECK -> 0.5 * Math.pow(messwert, 2);
            case RECHTECK -> Math.pow(messwert,2);
        };

    }

    public double flaeche(Shapes form, double g, double h) {

        return switch(this) {
            default -> 0;
            case DREIECK -> 0.5 * g * h;
            case RECHTECK -> g * h;
        };

    }

}
