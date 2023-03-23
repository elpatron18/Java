package KA4_Uebung.Himmelsrichtung_Enum;

public enum Himmelsrichtung {
    NORD, OST, WEST, SUED;

    public Himmelsrichtung gegenueber() {
        switch(this) {
            case NORD: return SUED;
            case OST: return WEST;
            case WEST: return OST;
            case SUED: return NORD;
            default: return null;
        }
    }

    public String zuString() {
        switch (this) {
            default: return null;
            case NORD: return "Nord";
            case OST: return "Ost";
            case SUED: return "Süd";
            case WEST: return "West";
        }
    }

}


