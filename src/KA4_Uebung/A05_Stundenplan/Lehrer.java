package KA4_Uebung.A05_Stundenplan;

public enum Lehrer {

    RIDDER, BURGER, WELLSTEIN;

    public String toString() {
        return switch (this) {
            case BURGER -> "Herr Burger ";
            case RIDDER -> "Frau Ridder ";
            case WELLSTEIN -> "Herr Wellstein ";
        };
    }

}
