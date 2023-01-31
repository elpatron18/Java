package PR1.KA4_Uebung.Stundenplan;

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
