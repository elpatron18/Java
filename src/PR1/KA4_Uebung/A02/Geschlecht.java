package PR1.KA4_Uebung.A02;

public enum Geschlecht{

    MANN, FRAU, DIVERS;

    public String toAdjektiv() {
        return switch (this) {
            default -> null;
            case FRAU -> "weiblich";
            case MANN -> "männlich";
            case DIVERS -> "divers";
        };
    }

}
