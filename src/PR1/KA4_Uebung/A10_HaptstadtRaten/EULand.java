package PR1.KA4_Uebung.A10_HaptstadtRaten;

public enum EULand {

    SPANIEN("Madrid"), FRANKREICH("Paris"), BELGIEN("Brüssel"),
    UKRAINE("Kiew"), KROATIEN("Zagreb");

    public final String hauptstadt;

    private EULand(String hauptstadt) {
        this.hauptstadt = hauptstadt;
    }

}
