package KA4_Uebung.A09_Biertank;

public enum Masseinheit {

        LITER(1, "Liter"), HALBE(0.5, "Halbe"), DOSE(0.3, "Dosen");

    public final double liter;
    public final String name;
    Masseinheit(double liter, String name) {
        this.liter = liter;
        this.name = name;
    }

}
